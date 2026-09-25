package jobsheet1.tugas;

public class demo {
    public static void main(String[] args) {
        // penghapus
        Penghapus penghapus = new Penghapus();
        penghapus.warna = "Putih";
        penghapus.bentuk = "Kotak";
        penghapus.cetakInfo();
        penghapus.hapus();
        penghapus.bersihkan();
        System.out.println();

        // penggaris
        Penggaris penggaris = new Penggaris();
        penggaris.panjang = 30;
        penggaris.bahan = "Plastik Bening";
        penggaris.cetakInfo();
        penggaris.buatGaris();
        penggaris.ukurBenda();
        System.out.println();

        // tas
        Tas tasBiasa = new Tas();
        tasBiasa.merk = "Polo";
        tasBiasa.warna = "Abu-abu";
        tasBiasa.cetakInfo();
        tasBiasa.buka();
        tasBiasa.tutup();
        System.out.println();

        // Tas Ransel 
        TasRansel ransel = new TasRansel();
        ransel.merk = "Eiger";          
        ransel.warna = "Hitam";    
        ransel.jumlahKantong = 3;
        ransel.adaTempatLaptop = true;
        ransel.cetakInfo();
        ransel.buka();                 
        ransel.masukkanBarang();
        ransel.pasangJasHujan();
        ransel.tutup();                
        System.out.println();

        // Tas Selempang 
        TasSelempang selempang = new TasSelempang();
        selempang.merk = "Bodypack";    
        selempang.warna = "Cokelat";    
        selempang.panjangTali = 110;
        selempang.adaResletingDepan = true;
        selempang.cetakInfo();
        selempang.buka();              
        selempang.masukkanBarang();
        selempang.aturPanjangTali();
        selempang.tutup();             
    }
}
