import java.util.Scanner;
class Mat5{
public void Grt(int a){
int c=0;
for(int i=1;i<=a/2;i=i+1){
if(a%i==0){
c=c+1;
}
}
if (c==1){
System.out.println(a+" IS PRIME NUMBER");
}
else{
System.out.println(a+" IS NOT PRIME NUMBER");
}
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number ");
int a= sc.nextInt();
Mat5 m= new Mat5();
m.Grt(a);
}
}

//prime number