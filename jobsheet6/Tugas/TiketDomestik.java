package jobsheet6.Tugas;

public class TiketDomestik extends TiketPesawat{
    public int pajakBandara;

    public TiketDomestik() {

    }

    public TiketDomestik(TiketPesawat tiket, int pajakBandara) {
        super(new Tiket (tiket.kodeTiket, tiket.namaPenumpang, tiket.asal, tiket.tujuan, tiket.hargaDasar), tiket.maskapai, tiket.beratBagasi);
        this.pajakBandara = pajakBandara;
    }

    public void tampilDomestik() {
        super.tampilPesawat();
        System.out.println("Pajak Bandara = " +pajakBandara);
        System.out.println("Total Bayar = " +(hargaDasar+hitungBiayaBagasi()+pajakBandara));
    }
}
