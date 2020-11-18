package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu implements ActionListener {
    JButton buttonInput;
    JFrame frame = new JFrame();
    JLabel label;
    public MainMenu(){
        frame.setSize(500,700);

        label = new JLabel("Main Menu");
        label.setFont(new Font("Serif",Font.PLAIN,20));
        label.setBounds(200,20,150,50);
        frame.add(label);

        buttonInput = new JButton("Insert Data Jurusan Baru");
        buttonInput.setFont(new Font("Serif", Font.PLAIN, 17));
        buttonInput.setActionCommand("insertJurusanBaru");
        buttonInput.setBounds(125,200,250,50);
        buttonInput.addActionListener(this);
        frame.add(buttonInput);

        buttonInput = new JButton("Insert Data Semua Jurusan");
        buttonInput.setFont(new Font("Serif", Font.PLAIN, 17));
        buttonInput.setActionCommand("insertSemuaJurusan");
        buttonInput.setBounds(125,275,250,50);
        buttonInput.addActionListener(this);
        frame.add(buttonInput);

        buttonInput = new JButton("Insert Data Mahasiswa Baru");
        buttonInput.setFont(new Font("Serif", Font.PLAIN, 17));
        buttonInput.setActionCommand("insertMahasiswaBaru");
        buttonInput.setBounds(125,350,250,50);
        buttonInput.addActionListener(this);
        frame.add(buttonInput);

        buttonInput = new JButton("Insert Data Mahasiswa Per Jurusan");
        buttonInput.setFont(new Font("Serif", Font.PLAIN, 17));
        buttonInput.setActionCommand("insertMahasiswaJurusan");
        buttonInput.setBounds(100,425,300,50);
        buttonInput.addActionListener(this);
        frame.add(buttonInput);

        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command){
            case "insertJurusanBaru":
                new JurusanBaruMenu();
                break;
            case "insertSemuaJurusan":
                System.out.println("b");
                break;
            case "insertMahasiswaBaru":
                new MahasiswaBaruMenu();
                break;
            case "insertMahasiswaJurusan":
                System.out.println("d");
                break;
        }
        frame.dispose();
    }
}
