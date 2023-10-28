import java.util.Scanner;
class Loop13{
public static void main(String[] args){
int a,s=0;
Scanner sc=new Scanner(System.in);

while(true){
a=sc.nextInt();
if(a==-1){
break;
}
s=s+a;
}
System.out.println(s);
}
}
//to input numbers till -1 is inserted and print the sum of inserted numbers