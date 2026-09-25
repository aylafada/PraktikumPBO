package jobsheet4.Tugas2;

public class MainTugas2 {
    public static void main(String[] args) {
        // 1. Buku dibuat mandiri di luar
        Buku b = new Buku("Pemrograman Java");

        // 2. Perpustakaan menampung Buku (Agregasi) dan merakit Ruang sendiri (Komposisi)
        Perpustakaan perpus = new Perpustakaan("Perpus Polinema", b, "Ruang Baca 1");
        perpus.info();

        System.out.println("--------------------------------");

        // 3. Anggota memakai Buku untuk transaksi pinjam (Dependency)
        Anggota anggota = new Anggota("Ayla");
        anggota.pinjam(b);
    }
}

