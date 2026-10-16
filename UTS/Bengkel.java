package UTS;

public class Bengkel {
    private String nama;
    private BayServis[] daftarBay;
    private Mekanik kepala;

    public Bengkel(String nama, int jumlahBay) {
        this.nama = nama;
        this.daftarBay = new BayServis[jumlahBay];
        for (int i = 0; i < jumlahBay; i++) {
            this.daftarBay[i] = new BayServis(i + 1);
        }
    }

    public void setKepala(Mekanik kepala) {
        this.kepala = kepala;
    }

    public void terimaServis(Servis s) {
        if (s == null) {
            System.out.println("Servis tidak boleh null.");
            return;
        }
        for (BayServis bay : daftarBay) {
            if (bay.isKosong()) {
                bay.terima(s);
                return;
            }
        }
        System.out.println("Semua bay penuh.");
    }

    public void terimaServis(Servis s, int nomorBay) {
        if (s == null) {
            System.out.println("Servis tidak boleh null.");
            return;
        }
        if (nomorBay < 1 || nomorBay > daftarBay.length) {
            System.out.println("Nomor bay tidak valid: " + nomorBay);
            return;
        }
        daftarBay[nomorBay - 1].terima(s);
    }

    public Servis selesaikan(int nomorBay) {
        if (nomorBay < 1 || nomorBay > daftarBay.length) {
            System.out.println("Nomor bay tidak valid: " + nomorBay);
            return null;
        }
        return daftarBay[nomorBay - 1].selesai();
    }

    public void tampilInfo() {
        String namaKepala = (kepala != null) ? kepala.getNama() : "-";
        System.out.println("Bengkel " + nama + " (kepala: " + namaKepala + ")");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < daftarBay.length; i++) {
            if (i > 0) {
                sb.append(" | ");
            }
            sb.append("Bay ").append(i + 1).append(": ");
            if (daftarBay[i].isKosong()) {
                sb.append("kosong");
            } else {
                sb.append(daftarBay[i].getServis().getPlatNomor());
            }
        }
        System.out.println(sb.toString());
    }
}

