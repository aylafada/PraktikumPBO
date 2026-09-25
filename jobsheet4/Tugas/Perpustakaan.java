package jobsheet4.Tugas;

public class Perpustakaan {
    private String nama;

    private Buku[] daftarBuku;
    private Rak[] daftarRak;

    public Perpustakaan(String nama, Buku[] daftarBuku, int jumlahRak) {
        this.nama = nama;
        this.daftarBuku = daftarBuku;
        this.daftarRak = new Rak[jumlahRak];

        for (int i = 0; i < daftarRak.length; i++) {
            this.daftarRak[i] = new Rak(
                    "R" + (i + 1),
                    "Lantai " + (i + 1)
            );
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Buku[] getDaftarBuku() {
        return daftarBuku;
    }

    public Rak[] getDaftarRak() {
        return daftarRak;
    }

    public void info() {
        System.out.println(" PERPUSTAKAAN ");
        System.out.println("Nama: " + nama);

        System.out.println("\nDaftar Buku:");
        for (int i = 0; i < daftarBuku.length; i++) {
            System.out.println("\nBuku ke-" + (i + 1));
            daftarBuku[i].info();
        }

        System.out.println("\nDaftar Rak:");
        for (int i = 0; i < daftarRak.length; i++) {
            System.out.println("\nRak ke-" + (i + 1));
            daftarRak[i].info();
        }
    }
}