import java.util.Scanner;
class Mat3{
public void fact(){
Scanner sc=new Scanner(System.in);
System.out.println("ENTER NUMBER ");
int a= sc.nextInt();
int f=1;
for (int i=a;i>=1;i=i-1){
f=f*i;
}
System.out.println("FACTORIAL OF "+a+" IS "+f);
}
public static void main(String[] args){
Mat3 m= new Mat3();
m.fact();
}
}

//factorial using methods