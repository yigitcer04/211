import java.util.List;
import java.util.ArrayList;

public class Order {
    public Customer customer;
    public List<Product> cart = new ArrayList<>();

    public Order(Customer customer) {
        this.customer = customer;
    }

    public void addProduct(Product p) {
        cart.add(p);
    }

    public double calculateTotal() {
        return cart.stream().mapToDouble(p -> p.price).sum();
    }

    public void displayOrder() {
        System.out.println("Order for " + customer.username + ":");
        cart.forEach(p -> p.displayInfo());
        System.out.println("Total: $" + calculateTotal());
        System.out.println("----------------------------");
    }
}

