package jobsheet4.TugasTeori;

public class Mesin {
    private int kapasitas;
    private String tipeBahanBakar;

    // Konstruktor default
    public Mesin() {
        this.kapasitas = 0;
        this.tipeBahanBakar = "";
    }

    // Konstruktor berparameter
    public Mesin(int kapasitas, String tipeBahanBakar) {
        this.kapasitas = kapasitas;
        this.tipeBahanBakar = tipeBahanBakar;
    }

    // Getter dan Setter
    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getTipeBahanBakar() {
        return tipeBahanBakar;
    }

    public void setTipeBahanBakar(String tipeBahanBakar) {
        this.tipeBahanBakar = tipeBahanBakar;
    }
}

