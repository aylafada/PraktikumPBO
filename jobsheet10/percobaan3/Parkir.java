package jobsheet10.percobaan3;

public class Parkir {
    public int hitungBiaya(Kendaraan k, int lamaJam) {
    int biaya = k.getTarifPerJam() * lamaJam;
        if (k instanceof Mobil m) {
            biaya += m.getBiayaValet();
        } else if (k instanceof Motor mo) {
            biaya += mo.getBiayaHelm();
        } else if (k instanceof Bus) {
            biaya += ((Bus) k).getBiayaKebersihan();
        }
        return biaya;
    }
    // public int hitungBiaya(Kendaraan k, int lamaJam) {
    // int biaya = k.getTarifPerJam() * lamaJam;
    //     if (k instanceof Mobil) {
    //     biaya += ((Mobil) k).getBiayaValet();
    //     } else if (k instanceof Motor) {
    //     biaya += ((Motor) k).getBiayaHelm();
    //     }
    //     return biaya;
    // }
}
