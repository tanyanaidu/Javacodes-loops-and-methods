import java.util.Scanner;
class Size{
int m,cm;

public static void main(String [] args){
Size v1= new Size();
Size v2= new Size();
Size v3= new Size();
Scanner sc= new Scanner(System.in);
System.out.println("1.Enter meter and centimeter ");
v1.m=sc.nextInt();
v1.cm=sc.nextInt();
System.out.println("2.Enter meter and centimeter ");
v2.m=sc.nextInt();
v2.cm=sc.nextInt();
System.out.println("3.Enter meter and centimeter ");
v3.m=sc.nextInt();
v3.cm=sc.nextInt();

int m1,cm1,cm2;
m1=v1.m+v2.m+v3.m;
System.out.println("Without calculation meter "+m1);
cm1=v1.cm+v2.cm+v3.cm;
System.out.println("Without calculation centimeter "+cm1);
if(cm1>99){
cm2=cm1%100;
m1=m1+(cm1/100);
System.out.println("With calculation meter "+m1);
System.out.println("With calculation centimeter "+cm2);
}
}
}