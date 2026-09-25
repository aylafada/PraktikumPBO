package jobsheet4.Tugas;

public class Rak {
    private String kode;
    private String lokasi;

    public Rak() {
    }

    public Rak(String kode, String lokasi) {
        this.kode = kode;
        this.lokasi = lokasi;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public void info() {
        System.out.println("Kode Rak : " + kode);
        System.out.println("Lokasi   : " + lokasi);
    }
}