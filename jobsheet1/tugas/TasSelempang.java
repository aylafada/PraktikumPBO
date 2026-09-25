package jobsheet1.tugas;

class TasSelempang extends Tas {
    public int panjangTali;
    public boolean adaResletingDepan;

    public void masukkanBarang() {
        System.out.println("Memasukkan dompet dan charger ke tas selempang");
    }

    public void aturPanjangTali() {
        System.out.println("Panjang tali selempang disetel menjadi " +panjangTali + " cm");
    }

    @Override
    public void cetakInfo() {
        System.out.println("=== Tas Selempang ===");
        System.out.println("Merk : " +merk);
        System.out.println("Warna : " +warna);
        System.out.println("Panjang Tali : " +panjangTali + " cm");
        System.out.println("Resleting Depan : " +(adaResletingDepan ? "Ada":"Tidak Ada"));
    }
}
