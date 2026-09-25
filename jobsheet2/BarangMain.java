public class BarangMain {
    public static void main(String[] args) {
        Barang b = new Barang();
        b.kode = "B001";
        b.namaBarang = "Kran";
        b.hargaDasar = 500000;
        b.diskon = 10;

        b.tampilData();
    }
}
