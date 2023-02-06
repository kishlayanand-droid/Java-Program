import java.util.*;
class Arlarg
{
public static void main(String args[])
{
int n;
int[] a=new int[50];
Scanner s=new Scanner(System.in);
System.out.print("Enetr the size of Array:");
n=s.nextInt();
for(int i=0;i<n;i++)
{
System.out.print("Enter the value of a["+i+"]=");
a[i]=s.nextInt();
}
int largest=a[0];
for(int i=0;i<n;i++)
{
if(a[i]>largest)
largest=a[i];
}
System.out.print("Largest number="+largest);
}
}
