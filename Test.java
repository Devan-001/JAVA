class Animall{
    String name = "Animal";
}
class Dogg extends Animall{
    String name = "Dog";
    void display(){
        System.out.println(name);
        System.out.println(super.name);
    }
}
public class Test {
    public static void main(String[] args){
        Dogg d = new Dogg();
        d.display();
    }
}