public class Electronics extends Product {
    public int warrantyMonths;

    public Electronics(String name, double price, int warrantyMonths) {
        super(name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " - $" + price + " (" + warrantyMonths + " months warranty)");
    }
}
