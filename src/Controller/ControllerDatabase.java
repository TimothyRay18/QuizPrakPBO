package Controller;

import Model.Jurusan;
import Model.Mahasiswa;

import java.sql.*;
import java.util.ArrayList;

public class ControllerDatabase {
    static DataBaseHandler conn = new DataBaseHandler();

    public static boolean insertJurusan(Jurusan jurusan) {
        conn.connect();
        String query = "INSERT INTO jurusan VALUES(?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, jurusan.getKode());
            stmt.setString(2, jurusan.getNama());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    public static ArrayList<Jurusan> getAllJurusan() {
        ArrayList<Jurusan> listJurusan = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM jurusan";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Jurusan jurusan = new Jurusan();
                jurusan.setKode(rs.getString("kode"));
                jurusan.setNama(rs.getString("nama"));
                listJurusan.add(jurusan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (listJurusan);
    }

    public static boolean insertMahasiswa(Mahasiswa mahasiswa) {
        conn.connect();
        String query = "INSERT INTO mahasiswa VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, mahasiswa.getNim());
            stmt.setString(2, mahasiswa.getNama());
            stmt.setInt(3, mahasiswa.getAngkatan());
            stmt.setString(4, mahasiswa.getKode_jurusan());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    public static ArrayList<Mahasiswa> getAllMahasiswa() {
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM mahasiswa";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Mahasiswa mahasiswa = new Mahasiswa();
                mahasiswa.setNim(rs.getString("nim"));
                mahasiswa.setNama(rs.getString("nama"));
                mahasiswa.setAngkatan(rs.getInt("angkatan"));
                mahasiswa.setKode_jurusan(rs.getString("kode_jurusan"));
                listMahasiswa.add(mahasiswa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (listMahasiswa);
    }
}
