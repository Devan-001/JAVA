interface startable{
    void start();
}
class Carr implements startable{
    public void start(){
        System.out.println("Car has started");
    }
}
class Bike implements startable{
    public void start(){
        System.out.println("Bike has started");
    }
}
class Fan implements startable{
    public void start(){
        System.out.println("Fan has started");
    }
}
public class IntefaceExample {
    public static void main(String[] args){
        startable s;
        s = new Bike();
        s.start();
        s = new Carr();
        s.start();
        s = new Fan();
        s.start();
    }
}