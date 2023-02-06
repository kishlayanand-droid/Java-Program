import java.util.*;
class Volume
{
public static void main(String args[])
{
int l,b,h,v;
Scanner s=new Scanner(System.in);
System.out.println("Enter length,breadth and height-");
l=s.nextInt();
b=s.nextInt();
h=s.nextInt();
v=l*b*h;
System.out.println("Volume="+v);
}
}