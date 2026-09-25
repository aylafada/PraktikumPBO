package Kuis1;

public class Kulkas {
    private String merk;
    private Termostat termostat;

    public Kulkas(String merk) {
        this.merk = merk;
        this.termostat = new Termostat();
    }
    public void lebihDingin() {
        termostat.turun();
    }
    public void kurangDingin() {
        termostat.naik();
    }
    public void aturSuhu(int target) {
        if (target<1 || target>7) {
            System.out.println("Target suhu tidak valid");
            return;
        }
        while (termostat.getSuhu() <target) {
            termostat.naik();
        }
        while (termostat.getSuhu() >target) {
            termostat.turun();
        }
    }
    public void tampilkanInfo() {
        System.out.println("Kulkas " +merk +" | " +"Suhu : "+termostat.getSuhu() +" C");
    }
}
