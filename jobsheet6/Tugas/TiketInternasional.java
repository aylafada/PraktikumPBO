package jobsheet6.Tugas;

public class TiketInternasional extends TiketPesawat {
    public String nomorPaspor;
    public int asuransi;

    public TiketInternasional() {

    }

    public TiketInternasional(TiketPesawat tiket, String nomorPaspor, int asuransi) {
         super(new Tiket (tiket.kodeTiket, tiket.namaPenumpang, tiket.asal, tiket.tujuan, tiket.hargaDasar), tiket.maskapai, tiket.beratBagasi);
        this.nomorPaspor = nomorPaspor;
        this.asuransi = asuransi;
    }

    public void tampilInternasional() {
        super.tampilPesawat();
        System.out.println("Nomor Paspor = " +nomorPaspor);
        System.out.println("Asuransi = " +asuransi);
        System.out.println("Total Bayar = " +(hargaDasar+hitungBiayaBagasi()+asuransi));
    }
}
