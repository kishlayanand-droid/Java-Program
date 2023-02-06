import java.util.*;
class Armstrong
{
public static void main(String args[])
{
int n,r,temp;
double c=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter a number to check armstrong=");
n=s.nextInt();
temp=n;
int n1=n;
int count=0;
while(n1>0)
{
count=count+1;
n1=n1/10;
}
while(n>0)
{
r=n%10;
c=c+Math.pow(r,count);
n=n/10;
}
if(temp==c)
System.out.print(temp+" is a armstrong number");
else
System.out.print(temp+" is not a armstrong number");
}
}