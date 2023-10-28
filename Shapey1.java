import java.util.Scanner;
class Shapey1{
void area(int r){
float a;
a=3.131f*2*r;
System.out.println("area of circle "+a);
}
void area (int l, int b ){
int a;
a=l*b;
System.out.println("area of rectangle "+a);
}
void area (long h, long b ){
float a;
a=0.5f*h*b;
System.out.println("area of rectangle "+a);
}
public static void main(String [] args){
Shapey1 s= new Shapey1();
Scanner sc = new Scanner(System.in);
System.out.println("enter radius ");
s.area(sc.nextInt());
System.out.println("enter lenghth and breath ");
s.area(sc.nextInt(),sc.nextInt());
System.out.println("enter height and breadth ");
s.area(sc.nextLong(),sc.nextLong());
}
}

//printing area of triangle,circle and re trangle with method overloading

