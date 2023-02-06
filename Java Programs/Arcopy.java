import java.util.*;
class Arcopy
{
public static void main(String args[])
{
int n,i;
int[] a=new int[50];
int[] b=new int[50];
Scanner s=new Scanner(System.in);
System.out.print("Enter the size of a:");
n=s.nextInt();
for(i=0;i<n;i++)
{
System.out.print("Enter the value of a["+i+"]");
a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
b[i]=a[i];
}
System.out.print("Copied content of Array a:");
for(i=0;i<n;i++)
{
System.out.print(b[i]+" ");
}
}
}
