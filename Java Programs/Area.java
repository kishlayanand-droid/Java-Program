import java.util.Scanner;
public class Area 
{
public static void main(String args[])
{
int r;
double pi=3.14,area;
Scanner a=new Scanner(System.in);
System.out.print("Enter the radius=");
r=a.nextInt();
area=pi*r*r; 
System.out.println("Area of Circle="+area);
}
}