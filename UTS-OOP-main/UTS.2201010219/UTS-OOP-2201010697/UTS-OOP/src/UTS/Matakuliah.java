package UTS;

/**
 *
 * @author MUHAMAD SATRIAWAN
 * NIM: 2201010219
 * Tgl 21/06/2024
 */
public class Matakuliah {
    private String kode;
    private String nama;

    public Matakuliah(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}