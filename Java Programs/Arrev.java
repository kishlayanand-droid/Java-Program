import java.util.*;
class Arrev
{
public static void main(String args[])
{
int n,i,j,temp;
int[] a=new int[50];
Scanner s=new Scanner(System.in);
System.out.print("Enter the size of array:");
n=s.nextInt();
for(i=0;i<n;i++)
{
System.out.print("Enter the value of a["+i+"]=");
a[i]=s.nextInt();
}
for(i=0,j=n-1;i<(n/2);i++,j--)
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
System.out.print("Reversed array:");
for(i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
}
}