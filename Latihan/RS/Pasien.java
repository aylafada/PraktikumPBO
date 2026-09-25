package Latihan.RS;

public class Pasien {
    private String nama;

    public Pasien(String nama) {
        this.nama = nama;
    }

    // DEPENDENCY: Dokter hanya digunakan saat konsultasi berjalan
    public void konsultasi(Dokter dokter) {
        System.out.println("Pasien " + nama + " berkonsultasi dengan " + dokter.getNamaDokter());
    }
}

