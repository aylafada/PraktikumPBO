package jobsheet4.TugasTeori;

public class SepedaMotor {
    private String merek;
    private String warna;
    private Mesin mesin;
    private int maxSpeed;
    private int kecepatan;

    // Konstruktor default
    public SepedaMotor() {
        this.merek = "";
        this.warna = "";
        this.mesin = null;
        this.maxSpeed = 0;
        this.kecepatan = 0;
    }

    // Konstruktor berparameter
    public SepedaMotor(String merek, String warna, Mesin mesin, int maxSpeed) {
        this.merek = merek;
        this.warna = warna;
        this.mesin = mesin;
        this.maxSpeed = maxSpeed;
        this.kecepatan = 0;
    }

    // Menambah kecepatan
    public void tambahKecepatan() {
        if (kecepatan + 10 <= maxSpeed) {
            kecepatan += 10;
        } else {
            kecepatan = maxSpeed;
        }
    }
    public void kurangiKecepatan() {
        if (kecepatan - 10 >= 0) {
            kecepatan -= 10;
        } else {
            kecepatan = 0;
        }
    }

    // Getter dan Setter
    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public Mesin getMesin() {
        return mesin;
    }

    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
}
