import java.util.Scanner;
class Var{
int a,b,c;

public static void main(String [] args){
Var v= new Var();
Scanner sc= new Scanner(System.in);
System.out.println("Enter three numbers ");
v.a=sc.nextInt();
v.b=sc.nextInt();
v.c=sc.nextInt();
if (v.a>v.b && v.a>v.c){
System.out.println(v.a+" is greatest");
}
else if (v.a<v.b && v.b>v.c){
System.out.println(v.b+" is greatest");
}
else {
System.out.println(v.c+" is greatest");
}

}
}