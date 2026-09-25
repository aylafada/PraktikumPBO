package jobsheet1;

class Product {
    private final String itemName;
    private final float price;
    static int totBrg=0;

    public Product (String itemName, float price) {
        this.itemName = itemName;
        this.price = price;
        totBrg++;
    }

    public float total(int quantity) {
        return price * quantity;
    }

    public String getName() {
        return itemName;
    }

    public static void totBelanjaan() {
        System.out.println("Total belanjaan = " +totBrg);
    }

    public static void main(String[] args) {

        Product product1 = new Product ("Coffee", 120000.0f);
        Product product2 = new Product ("Sugar", 300000.0f);
        Product product3 = new Product ("Milk", 200000.0f);

        System.out.println("Nama Produk : " + product1.getName());
        System.out.println("Total Harga : " + product1.total(2));
        System.out.println("Nama Produk : " + product2.getName());
        System.out.println("Total Harga : " + product2.total(7));
        System.out.println("Nama Produk : " + product3.getName());
        System.out.println("Total Harga : " + product3.total(1));

        Product.totBelanjaan();
    }
}
