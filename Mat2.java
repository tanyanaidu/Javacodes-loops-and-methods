import java.util.Scanner;
class Mat2{
int Add(){
Scanner sc=new Scanner(System.in);
int a= sc.nextInt();
int b=sc.nextInt();
int c=a+b;
return c;
}
public static void main(String[] args){
Mat2 m= new Mat2();
System.out.println(m.Add());
}
}