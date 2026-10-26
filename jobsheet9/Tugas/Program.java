package jobsheet9.Tugas;

public class Program {
    public static void main(String[] args) {
        Keledai keledai = new Keledai("Keledai", 4, "Hehehehe", "Abu-Abu");
        Gorilla gorilla = new Gorilla("Gulali", 4, "Haaum Hauum", "Hitam Manis");
        Singa singa = new Singa("CingaCing", 4, "Roaar Roaaar", "Coklat");

        keledai.displayJenis();
        keledai.displayMakan();
        keledai.displayBinatang();
        System.out.println();

        gorilla.displayJenis();
        gorilla.displayMakan();
        gorilla.displayBinatang();
        System.out.println();

        singa.displayJenis();
        singa.displayMakan();
        singa.displayBinatang();
    }
}

