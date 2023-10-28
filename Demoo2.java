import java.util.Scanner;
class Demo2{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("ENTER TWO NUMBERS ");
int a= sc.nextInt();
int b= sc.nextInt();
Demo1 d= new Demo1();
d.add(a,b);
}
}