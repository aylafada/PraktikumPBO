package jobsheet4.Tugas;

public class Peminjaman {
    private String namaPeminjam;

    public Peminjaman() {
    }

    public Peminjaman(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public void setNamaPeminjam(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    // DEPENDENCY
    public void pinjam(Buku buku) {
        System.out.println(namaPeminjam + " meminjam buku: " + buku.getJudul());
    }
}