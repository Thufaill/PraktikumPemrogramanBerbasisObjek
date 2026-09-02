package Jobsheet1;

class Product {
    private final String itemName;
    private final float price;
    static int totbrg=0; //Tambahan

    public Product(String itemName, float price) {
        this.itemName = itemName;
        this.price = price;
        totbrg++; //Tambahan
    }

    public float total(int quantity) {
        return price * quantity;
    }

    public String getName() {
        return itemName;
    }

    public static void totbelanjaan() {
        System.out.println("Total belanjaan = "+totbrg); //Tambahan
    }
}

public class ObjectOriented {
    public static void main(String[] args) {
        Product product1 = new Product("Coffee", 120000.0f);
        Product product2 = new Product("Sugar", 30000.0f);
        Product product3 = new Product("Tea", 50000.0f); //Tambahan

        System.out.println(product1.getName() + ": " + product1.total(3));
        System.out.println(product2.getName() + ": " + product2.total(1));
        System.out.println(product3.getName() + ": " + product3.total(1)); //Tambahan
        Product.totbelanjaan(); //Tambahan
    }
}