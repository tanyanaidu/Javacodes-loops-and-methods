import java.util.Scanner;
class Loop19{
public static void main(String[] args){
int n,b,rev=0,m;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(true){
n=n+1;
m=n;
while (n!=0){
b=n%10;
rev=rev*10+b;
n=n/10;
}
if (rev==m){
System.out.println("Next Palindrone "+m);
break;
}
n=m;
rev=0;
}

}
}
//to print next palindrone