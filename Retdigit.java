import java.util.Scanner;
class Retdigit{
int i,a,b=0,max=0;
int grt(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number ");
a=sc.nextInt();
while (a!=0){
a=a%10;
if (a>max){
max=a;
}
a=a/10;
}
return max;
}

public static void main(String[] args){

Retdigit m= new Retdigit();
System.out.println(m.grt());
}
}

//max digit using method