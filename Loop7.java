import java.util.Scanner;
class Loop7{
public static void main(String[] args) {
int a,b=0;
Scanner sc= new Scanner(System.in);
System.out.println(" ENTER NUMBER ");
a= sc.nextInt();
int m=a;
while (a!=0){
b=a%10;
a=a/10;
}
System.out.println("Sum of first and last digit is "+(b+(m%10)));
}
}

//printing the sum of first and last digit of entered number






