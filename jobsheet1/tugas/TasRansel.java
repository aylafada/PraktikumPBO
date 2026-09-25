package jobsheet1.tugas;

class TasRansel extends Tas {
    public int jumlahKantong;
    public boolean adaTempatLaptop;

    public void masukkanBarang() {
        System.out.println("Memasukkan buku dan laptop ke dalam tas ransel");
    }

    public void pasangJasHujan() {
        System.out.println("Memasang jas pelindung hujan pada tas ransel");
    }

    @Override
    public void cetakInfo() {
        System.out.println("=== Tas Ransel ===");
        System.out.println("Merk : " +merk);
        System.out.println("Warna : " +warna);
        System.out.println("Jumlah Kantong: " +jumlahKantong);
        System.out.println("Tempat Laptop : " +(adaTempatLaptop ? "Ada":"Tidak Ada"));
    }
}
