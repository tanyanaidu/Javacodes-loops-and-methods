import java.util.Scanner;
class Loop14{
public static void main(String[] args){
int a,s=0,p=0,c=0;
Scanner sc=new Scanner(System.in);

while(true){
a=sc.nextInt();
if(a==-1){
break;
}
if (p>a){
c=c+1;
}
p=a;
}
if (c==0)
{
System.out.println("YES");
}
else{
System.out.println("NO");
}
}
}

// to input numbers till -1 is inserted and check whether they are in ascending order or not