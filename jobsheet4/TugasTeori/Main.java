package jobsheet4.TugasTeori;

public class Main {
    public static void main(String[] args) {

        Mesin mesin = new Mesin(150, "Pertalite");

        SepedaMotor motor = new SepedaMotor(
                "Honda",
                "Hitam",
                mesin,
                120
        );

        System.out.println("Merek       : " + motor.getMerek());
        System.out.println("Warna       : " + motor.getWarna());
        System.out.println("Kapasitas   : " + motor.getMesin().getKapasitas() + " cc");
        System.out.println("Bahan Bakar : " + motor.getMesin().getTipeBahanBakar());
        System.out.println("Max Speed   : " + motor.getMaxSpeed() + " km/jam");

        motor.tambahKecepatan();
        motor.tambahKecepatan();

        System.out.println("Kecepatan   : " + motor.getKecepatan() + " km/jam");

        motor.kurangiKecepatan();

        System.out.println("Kecepatan setelah dikurangi: "
                + motor.getKecepatan() + " km/jam");
    }
}
