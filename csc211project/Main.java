import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        List<Product> products = new ArrayList<>();
        products.add(new Electronics("Laptop", 999.99, 24));
        products.add(new Electronics("Headphones", 199.99, 12));
        products.add(new Clothing("T-Shirt", 29.99, "M"));
        products.add(new Clothing("Jeans", 59.99, "L"));
        products.add(new Grocery("Milk", 3.99, "2025-11-30"));
        products.add(new Grocery("Bread", 2.49, "2025-11-25"));


        Customer customer1 = new Customer("Alice", "alice@email.com");
        Admin admin1 = new Admin("Bob", "bob@email.com");


        admin1.addProduct(products, new Electronics("Smartwatch", 249.99, 18));


        System.out.println("\nElectronics under $500:");
        products.stream()
                .filter(p -> p instanceof Electronics && p.price < 500)
                .forEach(p -> p.displayInfo());


        double discountRate = 0.10;
        products.forEach(p -> p.price = p.price * (1 - discountRate));

        System.out.println("\nProducts after 10% discount:");
        products.forEach(p -> p.displayInfo());


        System.out.println("\nProducts sorted by price:");
        products.stream()
                .sorted((p1, p2) -> Double.compare(p1.price, p2.price))
                .forEach(p -> p.displayInfo());


        Order order1 = new Order(customer1);
        order1.addProduct(products.get(0)); // Laptop
        order1.addProduct(products.get(2)); // T-Shirt
        order1.addProduct(products.get(4)); // Milk


        System.out.println("\nCustomer Order:");
        order1.displayOrder();


        String searchQuery = "jeans";
        System.out.println("\nSearch for products containing '" + searchQuery + "':");
        products.stream()
                .filter(p -> p.name.toLowerCase().contains(searchQuery.toLowerCase()))
                .forEach(p -> p.displayInfo());
    }
}

