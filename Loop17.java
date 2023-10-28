import java.util.Scanner;
class Loop17{
public static void main(String[] args){
int a,p=0,s=0,c=0;
Scanner sc=new Scanner(System.in);

while(true){
a=sc.nextInt();
if(a==-1){
break;
}
if (a!=p){
c=c+1;
}
p=a;
}


System.out.println("Unique numbers :"+c);

}
}

// to input numbers till -1 is inserted and print total no. of unique numbers