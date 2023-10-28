class Loop2{
public static void main(String[] args){
int f=1,n,i,sum=0;
for (n=5;n>=1;n=n-1){
for (i=n;i>=1;i=i-1){
f=f*i;

}
System.out.println("factorial of "+n+" is :"+f);
sum=sum+f;
f=1;

}
System.out.println("Sum is :"+sum);

}
}

//sum of factorial of 5 4 3 2 1