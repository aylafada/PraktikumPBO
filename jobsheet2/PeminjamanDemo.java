public class PeminjamanDemo {
    public static void main(String[] args) {
        Peminjaman p = new Peminjaman();
        p.id = "P001";
        p.namaMember = "Aylafada";
        p.namaGame = "Fast Moto";
        p.lamaSewa = 3;
        p.hargaSewa = 45000;

        p.tampilData();
    }
}
