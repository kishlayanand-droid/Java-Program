import java.util.*;
class Armax&2max
{
public static void main(String args[])
{
int n,i;
int[]a=new int[50];
int max=a[0];
int 2ndmax=a[0];
Scanner s=new Scannner(System.in);
System.out.print("Enter the size of a:");
n=s.nextInt();
for(i=0;i<n;i++)
{
System.out.print("Enter the value of a["+i+"]=");
a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
if(a[i]>max)
{
2ndmax=max;
max=a[i];
}
else if(a[i]>2ndmax)
{
2ndmax=a[i];
}
}
System.out.print("Maximum number"+max);
System.out.print("2nd Maximum number"+2ndmax);
}
}