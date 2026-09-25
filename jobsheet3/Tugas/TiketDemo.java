package jobsheet3.Tugas;

public class TiketDemo {
    public static void main(String[] args) {
        Tiket tiket1 = new Tiket("The Notebook", -50000);
        System.out.println("Film: " + tiket1.getJudulFilm());
        System.out.println("Harga Tiket: " + tiket1.getHargaDasar());
        System.out.println("Status Lunas: " + tiket1.isStatusPembayaran());
        
        System.out.println("\nMemproses pembayaran...");
        tiket1.lakukanPembayaran();
        System.out.println("Status Lunas Terbaru: " + tiket1.isStatusPembayaran());
    }
}

