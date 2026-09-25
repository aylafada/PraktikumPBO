package jobsheet1.tugas;

public class Penggaris {
    public int panjang;
    public String bahan;

    public void buatGaris() {
        System.out.println("Membuat garis lurus di buku tulis");
    }

    public void ukurBenda() {
        System.out.println("Mengukur panjang benda dengan penggaris");
    }

    public void cetakInfo() {
        System.out.println("=== Penggaris ===");
        System.out.println("Panjang : " +panjang + " cm");
        System.out.println("Bahan   : " +bahan);
    }
}
