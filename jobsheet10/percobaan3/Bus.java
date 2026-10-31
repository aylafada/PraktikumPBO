package jobsheet10.percobaan3;

public class Bus extends Kendaraan {
    private int biayaKebersihan;

    public Bus(String platNomor, int tarifPerJam, int biayaKebersihan) {
        super(platNomor, tarifPerJam);
        this.biayaKebersihan = biayaKebersihan;
    }

    @Override
    public int getTarifPerJam() {
        return tarifPerJam;
    }

    public int getBiayaKebersihan() {
        return biayaKebersihan;
    }
    
}
