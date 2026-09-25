package jobsheet1;

public class roadBike extends bike {
    private int tireWidth;

    public void setTireWidth(int width) {
        tireWidth = width;
    }

    @Override //inheritance : memanggil method yang sama persis dengan parent
    public void printInfo() {
        super.printInfo();
        System.out.println("Tire Width : " +tireWidth +" mm");
        System.out.println("Bike Type : Road Bike");
    }
}
