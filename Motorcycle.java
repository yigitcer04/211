// Motorcycle.java (Child class)
public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, Engine engine, boolean hasSidecar) {
        super(brand, engine);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void start() {
        System.out.println("Motorcycle " + brand + " is roaring to life...");
        engine.startEngine();
    }
}
