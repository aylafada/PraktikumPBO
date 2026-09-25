package Latihan.Resto;

public class Restoran {
    private String namaRestoran;
    private Menu menu; //Agregasi
    private Dapur dapur; //Komposisi

    public Restoran(String namaRestoran, Menu menu, String namaKoki) {
        this.namaRestoran = namaRestoran;
        this.menu = menu;
        //Komposisi : Dapur adalah bagian dari restoran
        // dapur tidak pernah dibuat di main, melainkan restoran itulah yang membangun dapurnya sendiri saat objek resto dibuat
        this.dapur = new Dapur(namaKoki);
    }

    public void info() {
        System.out.println("Nama Restoran: " + namaRestoran);
        System.out.println("Menu: " + menu.getNamaMenu() + " - Harga: " + menu.getHarga());
        System.out.println("Koki: " + dapur.getNamaKoki());
    }   


}
