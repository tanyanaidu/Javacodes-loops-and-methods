import java.util.Scanner;
class Loop4{
public static void main(String[] args) {
int a,b,n,i,c=0,sum=0;
Scanner sc= new Scanner(System.in);
System.out.println(" ENTER TWO NUMBERS ");
a= sc.nextInt();
b=sc.nextInt();
for(n=a;n<=b;n=n+1){
for(i=1;i<=n/2;i=i+1){
if(n%i==0){
c=c+1;
}
}
if (c==1){
sum=sum+n;
System.out.println(n+" is Prime");
}
c=0;
}

System.out.println("SUM IS :"+sum);
}    
}

// program to print prime numbers between a and b and print their sum
