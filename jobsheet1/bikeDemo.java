package jobsheet1;

public class bikeDemo {
    public static void main(String[] args) {

        bike bike1 = new bike();
        
        bike mountainBike1 = new bike();
        bike mountainBike2 = new bike();
        roadBike roadBike1 = new roadBike();

        mountainBike1.setBrand("Trek");
        mountainBike1.gearChanges(2);
        mountainBike1.speedAcceleration(10);
        mountainBike1.printInfo();

        mountainBike2.setBrand("Giant");
        mountainBike2.gearChanges(3);
        mountainBike2.speedAcceleration(20);
        mountainBike2.printInfo();

        roadBike1.setBrand("Specialized");
        roadBike1.setTireWidth(25);
        roadBike1.speedAcceleration(15);
        //ini speed masih 5 soalnya ap? 
        roadBike1.gearChanges(4);
        roadBike1.printInfo();
    }
    
}
// import java.util.Scanner;
//         Scanner sc = new Scanner(System.in);
        // System.out.println("=== DATA BIKE ===");
        // System.out.println("Masukkan brand sepeda: ");
        // String brand = sc.nextLine();
        // System.out.println("");

        