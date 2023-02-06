import java.util.*;
class Patt5
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter a number:");
int n=s.nextInt();
for(int i=n;i>=1;i--)
{
System.out.println();
for(int j=1;j<=i;j++)
{
System.out.print(i);
}	
}
}
}