public class Peminjaman {
    public String id;
    public String namaMember;
    public String namaGame;
    public int lamaSewa;
    public double hargaSewa;

    public double hitungHargaBayar() {
        return lamaSewa*hargaSewa;
    }

    public void tampilData() {
        System.out.println("ID Peminjaman: " +id);
        System.out.println("Nama Member: "+namaMember);
        System.out.println("Nama Game: "+namaGame);
        System.out.println("Lama Sewa" +lamaSewa);
        System.out.println("Harga Sewa perhari: Rp" +hargaSewa);
        System.out.println("Total Bayar: " +hitungHargaBayar());
    }
}
