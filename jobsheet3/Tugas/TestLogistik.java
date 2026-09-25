package jobsheet3.Tugas;

import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);
        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + "kg");
        
        System.out.println("\nMasukkan muatan yang ingin ditambahkan (kg)");
        double tambah1 = sc.nextDouble();
        kontainerAlfa.tambahMuatan(tambah1);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + "kg");
        
        System.out.println("\nMasukkan muatan yang ingin ditambahkan (kg)");
        double tambah2 = sc.nextDouble();
        kontainerAlfa.tambahMuatan(tambah2);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + "kg");
        
        System.out.println("\nMasukkan berat barang yang ingin diturunkan (kg)");
        double turun1 = sc.nextDouble();
        kontainerAlfa.turunkanMuatan(turun1);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + "kg");
        
        sc.close();
    }
}