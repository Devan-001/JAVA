abstract class Vehicles{
    String brand;

    Vehicles(String brand){
        this.brand = brand;
    }
    void displayBrand(){
        System.out.println("The brand is: "+brand);
    }
    abstract void startEngine();
}
class Cars extends Vehicles{
    Cars(String brand){
        super(brand);
    }

    @Override
    void startEngine(){
        System.out.println("Key is used to start the car");
    }
}
public class abstractExample {
    public static void main(String[] args){
        Cars c = new Cars("Toyota");
        c.displayBrand();
        c.startEngine();
    }
}