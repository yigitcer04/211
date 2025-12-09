import java.util.List;

public class Admin extends User {
    public Admin(String username, String email) {
        super(username, email);
    }

    public void addProduct(List<Product> products, Product p) {
        products.add(p);
        System.out.println("Added product: " + p.name);
    }
}

