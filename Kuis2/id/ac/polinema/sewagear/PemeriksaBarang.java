package id.ac.polinema.sewagear;

/** Memeriksa kondisi barang saat dikembalikan penyewa. */
// public class PemeriksaBarang {
//     public void periksa(Perlengkapan barang) {
//         System.out.print("Pemeriksaan " + barang.getKode() + ": ");
//         if (barang instanceof Tenda) {
//             Tenda t = (Tenda) barang;
//             System.out.println(t.cekFrame());
//         } else if (barang instanceof Carrier) {
//             Carrier c = (Carrier) barang;
//             System.out.println(c.cekResleting());    
//         } else {
//             System.out.println("cek kondisi umum");
//         }
//     }
// }

public class PemeriksaBarang {

    public void periksa(Perlengkapan barang) { 
    System.out.print("Pemeriksaan " + barang.getKode() + ": ");
    // ((Tenda) barang).cekFrame();
        if (barang instanceof Tenda t) {
            System.out.println(t.cekFrame());
        } else if (barang instanceof Carrier c) {
            System.out.println(c.cekResleting());
        } else if (barang instanceof KomporPortable k) {
            System.out.println(k.cekRegulator());
        } else {
            System.out.println("cek kondisi umum");
        }
    }
}


