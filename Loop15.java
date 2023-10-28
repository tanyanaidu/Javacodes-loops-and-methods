import java.util.Scanner;
class Loop15{
public static void main(String[] args){
int n,i,c=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(true){
n=n+1;
for(i=1;i<=n/2;i=i+1){
if (n%i==0){
c=c+1;
}
}
if(c==1){
System.out.println(n+" next prime");
break;
}
c=0;
}
}
}
//to print next prime