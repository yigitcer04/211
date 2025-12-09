public class Clothing extends Product {
    public String size;

    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " - $" + price + " (Size: " + size + ")");
    }
}

