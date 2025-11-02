public class Main {
    public static void main(String[] args) {
        Engine carEngine = new Engine(200);
        Engine motoEngine = new Engine(100);

        Vehicle car = new Car("Toyota", carEngine, 4);
        Vehicle motorcycle = new Motorcycle("Harley", motoEngine, false);

        // Demonstrating polymorphism
        Vehicle[] vehicles = {car, motorcycle};

        for (Vehicle v : vehicles) {
            v.displayInfo();
            v.start(); // Polymorphic call
            System.out.println();
        }
    }
}
