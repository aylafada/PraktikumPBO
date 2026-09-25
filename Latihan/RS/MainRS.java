package Latihan.RS;

public class MainRS {
    public static void main(String[] args) {
        Dokter dr = new Dokter("dr. Ayla");
        RumahSakit rs = new RumahSakit("RS Bhakti Husda", dr, "Poli Umum");
        rs.info();

        System.out.println();

        Pasien pasien = new Pasien("Siti");
        pasien.konsultasi(dr);
    }

    // Komposisi: RumahSakit ke Poliklinik
    // Bukti di Kode: Baris this.poli = new Poliklinik(namaPoli); diketik langsung di dalam konstruktor RumahSakit.
    // Jika objek RumahSakit dihapus, unit Poliklinik di dalamnya musnah dan tidak bisa beroperasi sendiri.

    // Agregasi: RumahSakit ke Dokter
    // Bukti di Kode: Objek dibuat mandiri di Main (Dokter dr = new Dokter("dr. Tirta");), 
    // lalu disetor ke dalam Rumah Sakit via new RumahSakit(..., dr, ...), dan disimpan ke atribut: this.dokter = dokter;.

    // Dependency: Pasien ke Dokter
    // Bukti di Kode: Pada class Pasien, tidak ada atribut permanen bertipe Dokter. 
    // Objek dokter cuma diselipkan sebagai parameter pada fungsi: public void konsultasi(Dokter dokter).
    // Hubungannya hanya sebatas kebutuhan sesaat (uses-a). Pasien membutuhkan dokter hanya pada momen konsultasi tersebut berlangsung.
    // Selesai sesi konsultasi dijalankan, referensi dokter tidak dipegang terus-menerus oleh pasien.
}
