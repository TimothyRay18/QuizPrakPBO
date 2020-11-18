package View;

import Controller.ControllerDatabase;
import Model.Jurusan;
import Model.Mahasiswa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MahasiswaBaruMenu implements ActionListener {
    JFrame frame = new JFrame();
    JComboBox cbJurusan;
    JLabel label;
    JTextField nim,nama,angkatan;
    JButton buttonSubmit;
    ArrayList<Jurusan> listJurusan = new ArrayList<>();
    public MahasiswaBaruMenu(){
//        frame.setSize(500,300);
//
//        frame.setVisible(true);
//        frame.setLayout(null);
        frame.setSize(500,300);
        listJurusan = ControllerDatabase.getAllJurusan();

        label = new JLabel("NIM");
        label.setBounds(10, 30, 150, 30);
        nim = new JTextField();
        nim.setBounds(160, 30, 150, 30);
        frame.add(label);
        frame.add(nim);

        label = new JLabel("Nama");
        label.setBounds(10, 60, 150, 30);
        nama = new JTextField();
        nama.setBounds(160, 60, 150, 30);
        frame.add(label);
        frame.add(nama);

        label = new JLabel("Angkatan");
        label.setBounds(10, 90, 150, 30);
        angkatan = new JTextField();
        angkatan.setBounds(160, 90, 150, 30);
        frame.add(label);
        frame.add(angkatan);

        label = new JLabel("Jurusan");
        label.setBounds(10, 120, 150, 30);
        String lJurusan [] = new String[listJurusan.size()];
        for(int i=0;i<listJurusan.size();i++){
            lJurusan[i]=listJurusan.get(i).getNama();
        }
        cbJurusan = new JComboBox(lJurusan);
        cbJurusan.setBounds(160, 120, 150, 30);
        frame.add(cbJurusan);
        frame.add(label);

        buttonSubmit = new JButton("Insert Mahasiswa");
        buttonSubmit.setFont(new Font("Serif", Font.PLAIN, 17));
        buttonSubmit.setBounds(10,150,150,30);
        buttonSubmit.addActionListener(this);
        frame.add(buttonSubmit);

        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        listJurusan = ControllerDatabase.getAllJurusan();
        int i=0;
        for(i=0;i<listJurusan.size();i++){
            if(listJurusan.get(i).getNama().equals((String)cbJurusan.getSelectedItem())){
                break;
            }
        }
        Mahasiswa mahasiswa = new Mahasiswa(nim.getText(),nama.getText(),Integer.parseInt(angkatan.getText()),listJurusan.get(i).getKode());
        ControllerDatabase.insertMahasiswa(mahasiswa);
        new MainMenu();
        frame.dispose();
    }
}
