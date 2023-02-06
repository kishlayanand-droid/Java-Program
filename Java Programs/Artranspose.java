import java.util.*;
class Artranspose
{
public static void main(String args[])
{
int n,m,i,j;
int[][] a=new int[50][50];
Scanner s=new Scanner(System.in);
System.out.print("Enter the size of row for Array=");
n=s.nextInt();
System.out.print("Enter the size of coloum for Array=");
m=s.nextInt();
System.out.println("Enter the Element:");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("The Array before transpose:");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
System.out.println("The Array after transpose:");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[j][i]+" ");
}
System.out.println();
}
}
}