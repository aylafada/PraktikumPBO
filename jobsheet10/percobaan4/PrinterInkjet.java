package jobsheet10.percobaan4;

public class PrinterInkjet extends Printer {
    private String jenisTinta;

    public PrinterInkjet() {
        this.jenisTinta = "Tinta Cair";
        this.ukurankertas = "A4";
    }

    public String getJenisTinta() {
        return jenisTinta;
    }
}
