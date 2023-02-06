import java.util.*;
class DivisibleByTwo
{
public static void main(String args[])
{
Scanner d=new Scanner(System.in);
int n;
System.out.print("Enter n number=");
n=d.nextInt();
if (n%2==0)
System.out.print("Divisible by 2");
else
System.out.print("Not Divisible by  2");
}
}