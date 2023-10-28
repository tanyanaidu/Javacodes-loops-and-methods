import java.util.Scanner;
class Product{
String pname;
float price,discount;

public static void main(String[] args){
Product p1=new Product();
Product p2=new Product();
Product p3=new Product();
Scanner sc = new Scanner(System.in);

System.out.println("Enter first product name its price and discount");
p1.pname=sc.next();
p1.price=sc.nextFloat();
p1.discount=sc.nextFloat();

System.out.println("Enter second product name its price and discount");
p2.pname=sc.next();
p2.price=sc.nextFloat();
p2.discount=sc.nextFloat();

System.out.println("Enter third product name its price and discount");
p3.pname=sc.next();
p3.price=sc.nextFloat();
p3.discount=sc.nextFloat();

float b1,b2,b3;
b1=p1.price-(p1.price*p1.discount)/100;
b2=p2.price-(p2.price*p3.discount)/100;
b3=p3.price-(p3.price*p3.discount)/100;

if (b1<b2 && b1<b3){
System.out.println("Product 1 "+p1.pname);
}
if (b1>b2 && b2<b3){
System.out.println("Product 2 "+p2.pname);
}
if (b3<b2 && b1>b3){
System.out.println("Product 2 "+p3.pname);
}

}
}

