import java.util.*;
class Fibonacci
{
public static void main(String args[])
{
int i,n1=0,n2=1,n3=0,n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number upto which you want to display series=");
n=s.nextInt();
System.out.println("\n"+n1+"\n"+n2);
for(i=3;i<=n;i++)
{
n3=n1+n2;
System.out.println(""+n3);
n1=n2;
n2=n3;
}
}
}

        