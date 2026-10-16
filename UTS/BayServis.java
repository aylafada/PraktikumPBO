package UTS;

public class BayServis {
    private int nomor;
    private Servis servis;

    public BayServis(int nomor) {
        this.nomor = nomor;
    }

    public void terima(Servis s) {
        if (s == null) {
            System.out.println("Servis tidak boleh null.");
            return;
        }
        if (!isKosong()) {
            System.out.println("Bay " + nomor + " sedang terisi.");
            return;
        }
        this.servis = s;
    }

    public Servis selesai() {
        Servis hasil = this.servis;
        this.servis = null; 
        return hasil;
    }

    public boolean isKosong() {
        return servis == null;
    }

    public Servis getServis() {
        return servis;
    }
}

