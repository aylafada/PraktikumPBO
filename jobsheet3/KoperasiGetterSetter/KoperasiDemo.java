package jobsheet3.KoperasiGetterSetter;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Ayla", "Jl. Notodiharjo");
        System.out.println("Simpanan " +anggota1.getNama() +" : Rp" +anggota1.getSimpanan());

        anggota1.setNama("Aylafada Syakira");
        anggota1.setAlamat("Jalan Soekarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " +anggota1.getNama() +" : Rp" +anggota1.getSimpanan());
        anggota1.pinjam(5000);
        System.out.println("Simpanan " +anggota1.getNama() +" : Rp" +anggota1.getSimpanan());
    }
}
