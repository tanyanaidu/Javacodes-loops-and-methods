import java.util.Scanner;
class Loop18{
public static void main(String[] args){
int n,b,m,sum=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(true){
n=n+1;
m=n;
while(n!=0){
b=n%10;
sum=sum+(b*b*b);
n=n/10;
}
if (sum==m){
System.out.println("Nest Armstrong "+m);
break;
}
n=m;
sum=0;

}

}
}
//to print next armstrong