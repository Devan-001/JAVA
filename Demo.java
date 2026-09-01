class Students{
    String name = "Anjana";

    public String toString(){
        return "Student Name: " + name;
    }
}
public class Demo {
    public static void main(String[] args){
        Students s = new Students();
        System.out.println(s.getClass());
        System.out.println(s.getClass().getName());
    }
}