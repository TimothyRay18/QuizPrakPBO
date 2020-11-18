package View;

import Controller.ControllerDatabase;
import Model.Jurusan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class JurusanBaruMenu implements ActionListener {
    JButton buttonSubmit;
    JFrame frame = new JFrame();
    JLabel label;
    JTextField kode,nama;
    public JurusanBaruMenu(){
        frame.setSize(500,300);
//        frame.setSize(500,700);
        label = new JLabel("Kode");
        label.setBounds(10, 30, 150, 30);
        kode = new JTextField();
        kode.setBounds(160, 30, 150, 30);
        frame.add(label);
        frame.add(kode);

        label = new JLabel("Nama");
        label.setBounds(10, 60, 150, 30);
        nama = new JTextField();
        nama.setBounds(160, 60, 150, 30);
        frame.add(label);
        frame.add(nama);

        buttonSubmit = new JButton("Insert Jurusan");
        buttonSubmit.setFont(new Font("Serif", Font.PLAIN, 17));
        buttonSubmit.setBounds(10,90,150,30);
        buttonSubmit.addActionListener(this);
        frame.add(buttonSubmit);

        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<Jurusan> listJurusan = new ArrayList<>();
        listJurusan = ControllerDatabase.getAllJurusan();
        Jurusan jurusan = new Jurusan(kode.getText(),nama.getText());
        boolean found=false;
        for(int i=0;i<listJurusan.size();i++){
            if(listJurusan.get(i).getKode().equals(jurusan.getKode())){
                found=true;
            }
        }
        if(!found){
            ControllerDatabase.insertJurusan(jurusan);
            JOptionPane.showMessageDialog(null,"Insert Berhasil");
            new MainMenu();
        }else{
            JOptionPane.showMessageDialog(null,"Kode sudah terpakai, ganti kode");
            new JurusanBaruMenu();
        }
        frame.dispose();
    }
}
