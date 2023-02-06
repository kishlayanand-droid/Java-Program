import java.util.*;
class que1
{
public static void main(String args[])
{
int k,n;
Scanner s=new Scanner(System.in);
System.out.print("Enter Number of array elements :");
n=s.nextInt();
System.out.print("Enter ELements of array : ");
int[] z=new int[n];

for(int i=0;i<z.length;i++)
{
z[i]=s.nextInt();
}
System.out.print("Enter Value of K :");
k=s.nextInt();
int count=0;
int sum=0;
for(int i=0;i<z.length;i++)
{

for(int j=i+1;j<z.length;j++)
{
sum=z[i]+z[j];
if (sum==k)
count++;
}
sum=0;
}
System.out.print(count);
}
}
