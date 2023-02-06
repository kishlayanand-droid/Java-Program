import java.util.*;
class Arsum
{
public static void main(String args[]) 
{
int n,i,sum=0;
int[] a=new int[50];
Scanner s=new Scanner(System.in);
System.out.print("Enter the size of array:");
n=s.nextInt();
for(i=0;i<n;i++)
{
System.out.print("Enter the value of a["+i+"]=");
a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
sum=sum+a[i];
}
System.out.println("Sum of the Array:"+sum);
int avg=sum/n;
System.out.print("Average of array:"+avg);
}
}
