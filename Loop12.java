import java.util.Scanner;
class Loop12{
public static void main(String[] args) {
int a,b,c,d,z,i,r=1,sum=0,rev=0;
Scanner sc= new Scanner(System.in);
System.out.println(" ENTER NUMBER ");
a= sc.nextInt();
z=a;
while (a!=0){
b=a%10;
sum=sum+b;
a=a/10;
}
c=sum;
while (sum!=0){
d=sum%10;
rev=rev*10+d;
sum=sum/10;
}
r=c*rev;

if (r==z){
System.out.println("Magic");
}
else{
System.out.println("Not Magic");
}

}
}

//Magic number
