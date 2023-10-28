import java.util.Scanner;
class Retfact{
int i,a,b=0,f=1;
int grt(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number ");
a=sc.nextInt();
for (i=a;i>=1;i=i-1){
f=f*i;
}
return f;
}

public static void main(String[] args){

Retfact m= new Retfact();
System.out.println(m.grt());
}
}

//factorial using method