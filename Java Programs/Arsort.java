import java.util.*;
class Arsort
{
public static void main(String args[]) 
{
int n,i,j,temp;
int[] a=new int[50];
Scanner s=new Scanner(System.in);
System.out.print("Enter the size of Array:");
n=s.nextInt();
for(i=0;i<n;i++)
{
System.out.print("Enter the value of a["+i+"]=");
a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
System.out.print("Sorted Array:");
for(i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
}
}
