import java.util.Scanner;
class Loop11{
public static void main(String[] args) {
int a,b,sum=0,c;
Scanner sc= new Scanner(System.in);
System.out.println(" ENTER NUMBER ");
a= sc.nextInt();
c=a;
while(a!=0){
b=a%10;
sum=sum+(b*b*b);
a=a/10;
}
if (sum==c){
System.out.println("Armstrong");
}
else{
System.out.println("Not armstrong");
}

}
}

//Armstrong
