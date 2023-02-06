import java.util.*;
class Funfact
{
int fact(int n)
{
int i,f=1;
for(i=1;i<=n;i++)
{
f=f*i;
}
return f;
}
public static void main(String args[])
{
int y,n;
Scanner s=new Scanner(System.in);
Funfact obj=new Funfact();
System.out.print("Enter the value of n=");
n=s.nextInt();
y=obj.fact(n);
System.out.print("Factorial of a given number="+y);
}
}