package Latihan.Resto;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu("Nasi Goreng", 20000);
        Restoran restoran = new Restoran("Restoran Sederhana", menu, "Budi");
        Pelayan pelayan = new Pelayan("Ani");

        restoran.info();
        pelayan.catatPesanan(menu);
    }
}
