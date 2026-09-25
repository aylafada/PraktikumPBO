public class TestBarang02 {
    
    public static void main(String[] args) {
        Barang02 brg1 = new Barang02();
        brg1.namaBrg = "Pensil";
        brg1.jenisBrg="ATK";
        brg1.stok=10;
        brg1.tampilBarang();
        System.out.println("Stok Baru adalah " +brg1.tambahStok(20));

    }
}
