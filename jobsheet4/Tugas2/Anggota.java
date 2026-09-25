package jobsheet4.Tugas2;

public class Anggota {
    private String nama;

    public Anggota(String nama) {
        this.nama = nama;
    }

    // DEPENDENCY: Buku hanya hadir sebagai parameter sementara saat meminjam
    public void pinjam(Buku buku) {
        System.out.println(nama + " meminjam buku " + buku.getJudul());
    }
}
