import java.util.*;
class Pattern1
{
public static void main(String args[])
{
int i,j;
Scanner s=new Scanner(System.in);
System.out.println("Your Pattern !!");
for(i=1;i<=5;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}