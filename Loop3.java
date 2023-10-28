class Loop3{
public static void main(String[] args){
int f=1,n,i;
for (n=1;n<=7;n=n+2){
for (i=n;i>=1;i=i-1){
f=f*i;
}
System.out.println("factorial of "+n+" is :"+f);
f=1;

}

}
}

//sum of factorial of 1 3 5 7