import java.util.Scanner;
class Loop8{
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println(" ENTER NUMBER ");
int a= sc.nextInt();
while (a!=0){
int b=a%10;
a=a/10;
int f=1;
for (int i=1;i<=b;i++){
f=f*i;
}
System.out.println("Factorial of "+b+" is "+f);
}
}
}

//printing the factorial of digits of a
