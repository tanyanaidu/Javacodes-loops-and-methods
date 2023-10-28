import java.util.Scanner;
class Studenttt{
int r;
String n;
float m1,m2,m3;

public static void main(String[] args){
Studenttt s1= new Studenttt();
Studenttt s2= new Studenttt();
Scanner sc =new Scanner(System.in);
System.out.println("Enter Rollno, Name and Marks of three subjects of student 1");
s1.r=sc.nextInt();
s1.n= sc.next();
s1.m1= sc.nextFloat();
s1.m2= sc.nextFloat();
s1.m3= sc.nextFloat();

System.out.println("Enter Rollno, Name and Marks of three subjects of student 2 ");
s2.r=sc.nextInt();
s2.n= sc.next();
s2.m1= sc.nextFloat();
s2.m2= sc.nextFloat();
s2.m3= sc.nextFloat();

float t1,t2;
t1= s1.m1+ s1.m2+ s1.m3;
t2= s2.m1+ s2.m2+ s2.m3;

if (t1>t2){
System.out.println(s1.n+" Student 1 "+t1);
}
else{
System.out.println(s2.n+" Student 2 "+t2);
}
}
}
