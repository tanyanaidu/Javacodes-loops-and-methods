import java.util.Scanner;
class Retrev{
int b=0,rev=0;
int grt(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number ");
int n=sc.nextInt();
while(n!=0){
b=n%10;
rev=rev*10+b;
n=n/10;
}
return rev;
}

public static void main(String[] args){

Retrev m= new Retrev();
System.out.println(m.grt());
}
}

//reverse using method