// Parent Class
class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void displayVehicleInfo() {
        System.out.println("Brand: " + this.brand);
    }
}

// Child Class
class Car extends Vehicle {
    private String model;

    public Car(String brand, String model) {
        super(brand); // Passing brand to parent constructor
        this.model = model;
    }

    public void displayCarInfo() {
        super.displayVehicleInfo();
        System.out.println("Model: " + this.model);
    }
}

// Execution
public class Automobile {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla");
        myCar.displayCarInfo();
    }
}