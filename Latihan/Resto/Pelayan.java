package Latihan.Resto;

public class Pelayan {
    private String namaPelayan;

    public Pelayan(String namaPelayan) {
        this.namaPelayan = namaPelayan;
    }

    public void catatPesanan(Menu menu) {
        System.out.println("Pelayan " + namaPelayan + " mencatat pesanan." + menu.getNamaMenu());
    }

    //Dependency: Pelayan ke Menu
    // Bukti di Kode: Pada class Pelayan, objek Menu tidak dijadikan atribut class (private Menu menu tidak ada). 
    // Menu hanya hadir di dalam parameter method: public void catatPesanan(Menu menu).
    // Begitu method catatPesanan() selesai dieksekusi, interaksi antara pelayan dan menu selesai. 
    // Pelayan tidak menyimpan objek menu tersebut selamanya.
}
