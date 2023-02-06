import java.util.*;
class Armerg
{
public static void main(String args[])
{
int n,n1,i,j,k=0;
int[] a=new int[50];
int[] b=new int[50];
int[] c=new int[100];
Scanner s=new Scanner(System.in);
System.out.print("Enter size of Array1:");
n=s.nextInt();
for(i=0;i<n;i++)
{
System.out.print("Enter the value of a["+i+"]=");
a[i]=s.nextInt();
}
System.out.print("Enter size of Array2:");
n1=s.nextInt();
for(i=0;i<n1;i++)
{
System.out.print("Enter the value of b["+i+"]=");
b[i]=s.nextInt();
}
for(i=0;i<n;i++,k++)
{
c[k]=a[i];
}
for(i=0;i<n1;i++,k++)
{
c[k]=b[i];
}
System.out.print("Merged Array:");
for(i=0;i<n+n1;i++)
{
System.out.print(c[i]+" ");
}
}
}