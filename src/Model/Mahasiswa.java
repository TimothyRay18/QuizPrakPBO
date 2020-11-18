package Model;

public class Mahasiswa {
    String nim;
    String nama;
    int angkatan;
    String kode_jurusan;

    public Mahasiswa(String nim, String nama, int angkatan, String kode_jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.angkatan = angkatan;
        this.kode_jurusan = kode_jurusan;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public String getKode_jurusan() {
        return kode_jurusan;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    public void setKode_jurusan(String kode_jurusan) {
        this.kode_jurusan = kode_jurusan;
    }

    public Mahasiswa() {
    }
}
