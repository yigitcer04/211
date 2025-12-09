public class Grocery extends Product {
    public String expirationDate;

    public Grocery(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " - $" + price + " (Expires: " + expirationDate + ")");
    }
}

