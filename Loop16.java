import java.util.Scanner;
class Loop16{
public static void main(String[] args){
int a,s=0,p=0;
Scanner sc=new Scanner(System.in);

while(true){
a=sc.nextInt();
if(a==-1){
break;
}
if (p<a){
p=a;
}
}

System.out.println("Greatest number :"+p);

}
}

// to input numbers till -1 is inserted and print greatest among them