import java.util.*;
class Patt3
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter a number:");
int n=s.nextInt();
for(int i=1;i<=n;i++)
{
System.out.println();
for(int j=1;j<=i;j++)
{
System.out.print(i);
}	
}
}
}