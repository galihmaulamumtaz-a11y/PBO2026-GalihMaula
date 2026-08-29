class Product {

    private final String itemName;
    private final float price;

    public Product(String itemName, float price) {
        this.itemName = itemName;
        this.price = price;
    }

    public float total(int quantity) {
        return price * quantity;
    }

    public String getname() {
        return itemName;
    }
}

public class OOP {
    public static void main(String[] args) {

        Product product1 = new Product("Coffee", 120000.0f);
        Product product2 = new Product("Sugar", 30000.0f);

        System.out.println(product1.getname() + ": " + product1.total(3));
        System.out.println(product2.getname() + ": " + product1.total(1));
    }

}
