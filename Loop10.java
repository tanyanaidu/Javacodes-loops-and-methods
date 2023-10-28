import java.util.Scanner;
class Loop10{
public static void main(String[] args) {
int a,c,b,i,rev=0;
Scanner sc= new Scanner(System.in);
System.out.println(" ENTER NUMBER ");
a= sc.nextInt();
c=a;
while (a!=0){
b=a%10;
rev=rev*10+b;
a=a/10;
}
if (rev==c){
System.out.println("Palindrone");
}
else{
System.out.println("Not Palindrone");
}
}
}

//Palindrone
