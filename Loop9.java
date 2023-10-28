import java.util.Scanner;
class Loop9{
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println(" ENTER NUMBER ");
int a= sc.nextInt();
int c=a;
int sum=0;
while (a!=0){
int b=a%10;
a=a/10;
int f=1;
for (int i=1;i<=b;i++){
f=f*i;
}
sum=sum+f;
System.out.println("Factorial of "+b+" is "+f);
}
if (sum==c){
System.out.println("Strong Number");
}
else{
System.out.println("Not Strong");
}
}
}

//to check the number is strong or not
