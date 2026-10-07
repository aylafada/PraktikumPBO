package jobsheet7.Tugas.Overloading;

public class Utama {
    public static void main(String[] args) {

        Segitiga segitiga = new Segitiga();

        System.out.println("Total sudut jika satu sudut diketahui: "
                + segitiga.totalSudut(60));

        System.out.println("Total sudut jika dua sudut diketahui: "
                + segitiga.totalSudut(60, 80));

        System.out.println("Keliling segitiga: "
                + segitiga.keliling(3, 4, 5));

        System.out.println("Panjang sisi miring: "
                + segitiga.keliling(3, 4));
    }
}

