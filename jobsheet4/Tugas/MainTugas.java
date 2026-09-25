package jobsheet4.Tugas;

public class MainTugas {
    public static void main(String[] args) {

        Buku buku1 = new Buku(
                "Pemrograman Java",
                "Abdul Kadir",
                2024
        );

        Buku buku2 = new Buku(
                "Algoritma dan Struktur Data",
                "Budi Raharjo",
                2023
        );

        Buku[] daftarBuku = {buku1, buku2};

        Perpustakaan perpustakaan = new Perpustakaan("Perpustakaan Polinema",daftarBuku,2);
        perpustakaan.info();

        Peminjaman peminjaman = new Peminjaman("Ayla");
        peminjaman.pinjam(buku1);
    }
}
