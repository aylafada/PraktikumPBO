package jobsheet10.percobaan2;

public class Tester2 {
    public static void main(String[] args) {
        RegularStudent rStd = new RegularStudent("Rina",400);
        Student s;
        s = rStd; //Upcasting refrensi

        //Pemanggilan method melalui refrensi Student;
        System.out.println("" +s.getStudentInfo());
        System.out.println("------------------");
        //Pemanggilan method melalui refrensi RegularStudent
        System.out.println("" +rStd.getStudentInfo());
    }
}
