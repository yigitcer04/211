abstract class Animal {
    String name;

   
    Animal(String name) {
        this.name = name;
    }

    
    abstract void makeSound();

    
    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println("Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.makeSound(); 
        myDog.eat();       
    }
}
