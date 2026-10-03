package jobsheet6.Tugas;

public class TestTiket {
    public static void main(String[] args) {
        //tiket kereta
        Tiket dataKereta = new Tiket();
        dataKereta.kodeTiket = "KA-001";
        dataKereta.namaPenumpang = "Ayla";
        dataKereta.asal = "Batu";
        dataKereta.tujuan = "Banyuwangi";
        dataKereta.hargaDasar = 350000;

        TiketKereta kereta = new TiketKereta(dataKereta, 3, "12A");
        System.out.println("========== Tiket Kereta ==========");
        kereta.tampilKereta();

        //tiket pesawat domestik
        Tiket dataDomestik = new Tiket("GA-102", "Syakira", "Surabaya", "Denpasar", 900000);
        TiketPesawat pesawatDomestik = new TiketPesawat(dataDomestik, "Garuda Indonesia", 25);
        TiketDomestik domestik = new TiketDomestik(pesawatDomestik, 75000);
        System.out.println();

        System.out.println("========== Tiket Pesawat Domestik ==========");
        domestik.tampilDomestik();

        //tiket pesawat internasional
        Tiket dataInternasional = new Tiket("SQ-205", "Evan", "Jakarta", "Singapura", 2500000);
        TiketPesawat pesawatInternasional = new TiketPesawat(dataInternasional, "Singapore Airlines", 20);
        TiketInternasional internasional = new TiketInternasional(pesawatInternasional, "C1234567", 150000);
        System.out.println();

        System.out.println("========== Tiket Pesawat Internasional ==========");
        internasional.tampilInternasional();
    }
}
