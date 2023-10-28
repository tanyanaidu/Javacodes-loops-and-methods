import java.util.Scanner;
class Var1{
int a,b;

public static void main(String [] args){
Var1 v1= new Var1();
Var1 v2= new Var1();
Var1 v3= new Var1();
Var1 v4= new Var1();
Scanner sc= new Scanner(System.in);
System.out.println("Enter numbers ");
v1.a=sc.nextInt();
v1.b=sc.nextInt();
v2.a=sc.nextInt();
v2.b=sc.nextInt();
v3.a=v1.a+v2.a;
v3.b=v1.b+v2.b;
System.out.println("SUM "+v3.a+" "+v3.b);
v4.a=v1.a*v2.a;
v4.b=v1.b*v2.b;
System.out.println("PRODUCT "+v4.a+" "+v4.b);

}
}