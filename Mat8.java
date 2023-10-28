import java.util.Scanner;
class Mat8{
public void Grt(int a,int b,int c){
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
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THREE NUMBERS ");
int a= sc.nextInt();
int b= sc.nextInt();
int c= sc.nextInt();
Mat8 m= new Mat8();
m.Grt(a,b,c);
}
}

//greatest number