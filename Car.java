public class Car extends Vehicle {
    private int doors;

    public Car(String brand, Engine engine, int doors) {
        super(brand, engine);
        this.doors = doors;
    }

    @Override
    public void start() {
        System.out.println("Car " + brand + " is starting...");
        engine.startEngine();
    }

    public void openTrunk() {
        System.out.println("Trunk opened.");
    }
}
