import java.util.*;
class NxtPrime
{
public static void main(String args[])
{
int c=0;
Scanner s= new Scanner(System.in);
System.out.println("Enter a number-");
int n=s.nextInt();
for(int i=n+1;;i++)
{
for(int j=1;j<=i;j++)
{
if(i%j==0)
{
c++;
}
}
if(c==2)
{System.out.print(i);
break;}
c=0;
}
}
}