import java.util.Scanner;
class Mat4{
public void Grt(){
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THREE NUMBERS ");
int a= sc.nextInt();
int b= sc.nextInt();
int c= sc.nextInt();
if (a>b && a>c){
System.out.println(a+" is greatest");
}
if (a<b && b>c){
System.out.println(b+" is greatest");
}
if (c>b && a<c){
System.out.println(c+" is greatest");
}
}
public static void main(String[] args){
Mat4 m= new Mat4();
m.Grt();
}
}

//greatest number