package jobsheet1.tugas;

public class Penghapus {
    public String warna;
    public String bentuk;

    public void hapus() {
        System.out.println("Menghapus coretan di atas kertas");
    }

    public void bersihkan() {
        System.out.println("Membersihkan sisa karet penghapus");
    }

    public void cetakInfo() {
        System.out.println("=== Penghapus ===");
        System.out.println("Warna : " +warna);
        System.out.println("Bentuk : " +bentuk);
    }
}
