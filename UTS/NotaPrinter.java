package UTS;

public class NotaPrinter {
    private String model;

    public NotaPrinter(String model) {
        this.model = model;
    }

    public void cetakNota(Servis s) {
        if (s == null) {
            System.out.println("Tidak ada servis untuk dicetak.");
            return;
        }
        String pj = (s.getMekanikPJ() != null) ? s.getMekanikPJ().getNama() : "-";
        System.out.println("Nota [" + s.getJenis() + "] " + s.getKode() + " "
                + s.getPlatNomor() + " | PJ: " + pj
                + " | Total: " + s.hitungBiaya());
    }
}

