package jobsheet10.percobaan4;

public class PrinterLaser extends Printer {
    private String jenisTinta;

    public PrinterLaser() {
        this.jenisTinta = "Toner Bubuk";
        this.ukurankertas = "F4";
    }

    public String getJenisTinta() {
        return jenisTinta;
    }
}
