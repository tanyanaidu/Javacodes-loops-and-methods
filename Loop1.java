import java.util.Scanner;
class Loop1{
public static void main(String[] args) {
int a,b=0,m=9;
Scanner sc= new Scanner(System.in);
System.out.println("ENTER NUMBER ");
a= sc.nextInt();
while (a!=0){
b=a%10;
if(m>b){
m=b;
}
a=a/10;
}
System.out.println("SMALLEST DIGIT "+m);
}
}

//Program to insert a number and print its smallest digit




