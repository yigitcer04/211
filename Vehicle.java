public abstract class Vehicle {
    protected String brand;
    protected Engine engine;

    public Vehicle(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    // Polymorphic method
    public abstract void start();

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Engine: " + engine.getHorsepower() + " HP");
    }
}
