package jobsheet4.Tugas2;

public class Perpustakaan {
    private String nama;
    private Buku buku;    // AGREGASI: Buku dari luar
    private Ruang ruang;  // KOMPOSISI: Dibuat di dalam

    public Perpustakaan(String nama, Buku buku, String namaRuang) {
        this.nama = nama;
        this.buku = buku;
        this.ruang = new Ruang(namaRuang); // KOMPOSISI (di-new langsung di sini)
    }

    public void info() {
        System.out.println("Perpustakaan : " + nama);
        System.out.println("Koleksi Buku : " + buku.getJudul());
        System.out.println("Fasilitas    : " + ruang.getNamaRuang());
    }
}
