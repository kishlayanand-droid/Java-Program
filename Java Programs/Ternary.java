import java.util.*;
class Ternary
{
public static void main(String args[])
{
int a,b,c,d;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value of a,b and c=");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
d=a>b?(a>c?a:c):(b>c?b:c);
System.out.print(d+" is the greatest number");
}
}