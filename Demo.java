// Main class
public class Demo {

    public static void main(String[] args) {

        Car c = new Car();
        Bike b = new Bike();
        Bus bs = new Bus();

        c.display();
        b.display();
        bs.display();
    }
}

// First class
class Car {

    void display() {
        System.out.println("Car object created");
    }
}

// Second class
class Bike {

    void display() {
        System.out.println("Bike object created");
    }
}

// Third class
class Bus {

    void display() {
        System.out.println("Bus object created");
    }
}