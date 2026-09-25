package jobsheet1.tugas;

public class Tas {
    public String merk;
    public String warna;

    public void buka() {
        System.out.println("Membuka tas merk " +merk);
    }

    public void tutup() {
        System.out.println("Menutup tas kembali");
    }

    public void cetakInfo() {
        System.out.println("=== Tas ===");
        System.out.println("Merk : " +merk);
        System.out.println("Warna : " +warna);
    }
}
