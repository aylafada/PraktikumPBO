package jobsheet9.Tugas;

public class Gorilla extends Binatang implements IKarnivora, IHerbivora {

    public Gorilla(String nama, int jumlahKaki, String suara, String warnaBulu) {
        super(nama, jumlahKaki, suara, warnaBulu);
    }

    @Override
    public void displayJenis() {
        System.out.println("Jenis: Karnivora + Herbivora");
    }

    @Override
    public void displayMakan() {
        System.out.println("Makanan: Daging + Tumbuhan");
    }
}
