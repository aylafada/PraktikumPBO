package jobsheet10.percobaan3;

public class TestParkir {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("N 1234 AB", 5000, 10000);
        Motor motor = new Motor("N 5678 CD", 2000, 3000);
        Bus bus = new Bus("N 9999 EF", 10000, 15000);
        Parkir loket = new Parkir();
        System.out.println("Biaya parkir Mobil (3 jam): " + loket.hitungBiaya(mobil, 3));
        System.out.println("Biaya parkir Motor (4 jam): " + loket.hitungBiaya(motor, 4));
        System.out.println("Biaya parkir Bus (2 jam): " + loket.hitungBiaya(bus, 2));
    }
}
