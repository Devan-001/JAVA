class Shape{
    String color = "Red";

    void display(){
        System.out.println("The color is : "+ color);
    }
}
class Circle extends Shape{
    double radius = 0.5;

    void calculateArea(){
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle is: "+area);
    }
}
class Square extends Shape{
    double side = 4.0;

    void calculateArea(){
        double area = side * side;
        System.out.println("Area of the sqaure is: "+area);
    }
}
public class SampleProgram {
    public static void main(String[] args){
        Circle c = new Circle();
        c.display();
        c.calculateArea();

        Square s = new Square();
        s.display();
        s.calculateArea();
    }
}