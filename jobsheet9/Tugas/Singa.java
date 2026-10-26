package jobsheet9.Tugas;

public class Singa extends Binatang implements IKarnivora {

    public Singa(String nama, int jumlahKaki, String suara, String warnaBulu) {
        super(nama, jumlahKaki, suara, warnaBulu);
    }

    @Override
    public void displayJenis() {
        System.out.println("Jenis: Karnivora");
    }

    @Override
    public void displayMakan() {
        System.out.println("Makanan: Daging");
    }
}

