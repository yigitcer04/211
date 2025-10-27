interface Vehicle {
    void start();   
    void stop();    
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starting");
    }

    public void stop() {
        System.out.println("Car stopping");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start(); 
        myCar.stop();  
    }
}
