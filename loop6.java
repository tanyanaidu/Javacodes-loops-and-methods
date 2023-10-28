import java.util.Scanner;
class Loop6{
public static void main(String[] args) {

int a,b=0,count=0,sum=0;
Scanner sc= new Scanner(System.in);
System.out.println(" ENTER NUMBER ");
a= sc.nextInt();

while (a!=0){
b=a%10;
count=count+1;
sum=sum+b;
System.out.println(b);
a=a/10;
}


System.out.println("Numer of digits "+count);
System.out.println("Sum 0f digits "+sum);
}
}

//Program to insert a number print digits, count the digits and print their sum




