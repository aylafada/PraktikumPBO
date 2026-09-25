package Latihan.RS;

public class RumahSakit {

    private String namaRS;
    private Dokter dokter;    // AGREGASI
    private Poliklinik poli;  // KOMPOSISI

    public RumahSakit(String namaRS, Dokter dokter, String namaPoli) {
        this.namaRS = namaRS;
        this.dokter = dokter;
        this.poli = new Poliklinik(namaPoli); // KOMPOSISI: Dibuat langsung di dalam
    }

    public void info() {
        System.out.println("Rumah Sakit : " + namaRS);
        System.out.println("Dokter Jaga : " + dokter.getNamaDokter());
        System.out.println("Layanan     : " + poli.getNamaPoli());
    }
}

