import java.util.*;
class Leap
{
public static void main(String args[])
{
int year;
Scanner s=new Scanner(System.in);
System.out.print("Enter the year:");
year=s.nextInt();
if(((year%400==0)&&(year%100==0))||(year%4==0))
{
System.out.print("leap year");
}
else
{
System.out.print("Not a leap year");
}
}
}