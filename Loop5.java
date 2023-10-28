import java.util.Scanner;
class Loop5{
public static void main(String[] args) {
int a,b=0,m=0;
Scanner sc= new Scanner(System.in);
System.out.println("ENTER NUMBER ");
a= sc.nextInt();
while (a!=0){
b=a%10;
if (m<b){
m=b;
}
a=a/10;
}
System.out.println("GREATEST NUMBER "+m);
}
}

//Program to insert a number & print the greatest digit  




