package jobsheet7.Tugas.Overriding;

public class Main {
    
    public static void main(String[] args) {
        Manusia manusia;

        System.out.println("================");
        manusia = new Dosen();
        manusia.makan();

        // Dosen dosen = new Dosen();
        // dosen.lembur();

        System.out.println("=================");
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.tidur();

        // manusia = new Mahasiswa();
        // manusia.makan();
    }
}
