import java.util.Scanner;
class Mat6{
public void grt(int a){
if (a%2==0){
System.out.println(a+" IS EVEN");
}
else{
System.out.println(a+" IS ODD");
}
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number ");
int a= sc.nextInt();
Mat6 m= new Mat6();
m.grt(a);
}
}

//even odd