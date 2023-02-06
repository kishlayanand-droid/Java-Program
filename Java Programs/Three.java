import java.util.*;
class Three
{
public static void main(String args[])
{
int a,b,c;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value of a,b and c=");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
if(a>b&&a>c)
{
System.out.print(a+" is greatest");
}
else if(b>c)
{
System.out.print(b+" is greatest");
}
else
{
System.out.print(c+" is greatest");
}
}
}