import java.util.Scanner;
class Method{

void show(int n){
int c=0;
for(int i=1;i<=n/2;i=i+1){
if(n%i==0){
c=c+1;
}
}
if (c==1){
System.out.println(n+" IS PRIME NUMBER");
}
else{
System.out.println(n+" IS NOT PRIME NUMBER");
}
}

void show(int a, int b ){
int sum=0;
for (int i=a; i<=b; i=i+1){
int c=0;
for(int j=1;j<=i/2;j=i+1){
if(a%j==0){
c=c+1;
}
}
if (c==1){
System.out.println(a+" IS PRIME NUMBER");
}
}
}

void show(int a, int b, int c){
if (a>b && a>c){
System.out.println(a+" is greatest");
}
else if(a<b && b>c){
System.out.println(b+" is greatest");
}
else{
System.out.println(c+" is greatest");
}
}

public static void main(String [] args){
Method m= new Method();
Scanner sc = new Scanner(System.in);
System.out.println("enter number ");
m.show(sc.nextInt());
System.out.println("enter two numbers ");
m.show(sc.nextInt(),sc.nextInt());
System.out.println("enter three numbers");
m.show(sc.nextInt(),sc.nextInt(),sc.nextInt());
}
}

//Method overloading example
