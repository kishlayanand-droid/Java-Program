import java.util.*;
class Reverse
{
public static void main(String args[])
{
int n,rev=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter a number to reverse=");
n=s.nextInt();
while(n!=0)
{
rev=rev*10;
rev=rev+n%10;
n=n/10;
}
System.out.print("Reverse of a number="+rev);
}
}