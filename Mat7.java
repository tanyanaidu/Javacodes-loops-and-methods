import java.util.Scanner;
class Mat7{
int n,b=0,rev=0;
public void grt(int a){
n=a;
while(n!=0){
b=n%10;
rev=rev*10+b;
n=n/10;
}
if (a==rev){
System.out.println("Palindrone");
}
else{
System.out.println("not Palindrone");
}
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number ");
int a= sc.nextInt();
Mat7 m= new Mat7();
m.grt(a);
}
}

//even odd