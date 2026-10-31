package jobsheet10.percobaan2;

public class Tester3 {
    public static void main(String[] args) {
        RegularStudent rStd = new RegularStudent("Rina", 400);
        ScholarshipStudent sStd = new ScholarshipStudent("Bayu", "KIP Kuliah");
        LabRental lab = new LabRental(3, "LAB-JARINGAN");

        // Array heterogen Billable
        Billable b[] = {rStd, lab};

        // Array heterogen Student
        Student s[] = {rStd, sStd};

        // Pemrosesan array Billable
        for (Billable item : b) {
            System.out.println("Total tagihan: " + item.getBillAmount());
        }

        // Uji baris yang menyebabkan compile error
        // Student s2[] = {rStd, sStd, lab};
    }
}
