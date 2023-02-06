import java.util.Scanner;
class Prime
{
public static void main(String args[])
{
int i,n,f=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter a number to check a prime number=");
n=s.nextInt();
for(i=1;i<=n;i++)
{
if(n%i==0)
f=f+1;
}
if(f==2)
System.out.println("Prime number= "+n);
else
System.out.println("Not Prime Number= "+n);

}
}