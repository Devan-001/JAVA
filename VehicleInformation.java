class Vehicle{
    public String company;
    protected String model;
    String fuelType;

    Vehicle(String company,String model,String fuelType){
        this.company = company;
        this.model = model;
        this.fuelType = fuelType;
    }
}
class Car extends Vehicle{
    Car(String company,String model,String fuelType){
        super(company,model,fuelType);
    }
    void displayDetails(){
        System.out.println("Vehicle Information");
        System.out.println("--------------------");
        System.out.println("Company : "+company);
        System.out.println("Model : "+ model);
        System.out.println("Fuel Type : "+ fuelType);

    }
}
public class VehicleInformation {
    public static void main(String[] args){
        Car c = new Car("Toyota","Innova","Diesel");
        c.displayDetails();

        System.out.println();
        System.out.println("Car object created successfully");
    }
}