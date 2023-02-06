package mypack;
import java.util.Scanner;
public class Hi
{
public static void main (String[] args)
{
int n,n1,sum;
Scanner s=new Scanner(System.in);
System.out.print("Value of n and n1 to sum up=");
n=s.nextInt();
n1=s.nextInt();
sum=n+n1;
System.out.println("Sum="+sum);
}
}