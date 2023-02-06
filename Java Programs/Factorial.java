import java.util.Scanner;
class factorial
{
public static void main(String args[])
{
int i,n,f=1;
Scanner s=new Scanner(System.in);
System.out.print("Enter a number to find factorial=");
n=s.nextInt();
for(i=1;i<=n;i++)
{
f=f*i;
}
System.out.print("Factorial of a number="+f);
}
}