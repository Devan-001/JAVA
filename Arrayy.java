import java.util.Scanner ;
class Arrayy{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the array size");
int a = sc.nextInt();

int n[] = new int[a];

System.out.println("Enter the elements");

for(int i = 0 ; i < a ; i++){
n[i] = sc.nextInt();
}

for (int i = 0 ; i < a ; i++){
System.out.println("elements are : " +n[i]);

}
sc.close();
}
}