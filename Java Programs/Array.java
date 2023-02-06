import java.util.*;
class Array
{
public static void main(String args[])
{
int[] z=new int[10];
Scanner s=new Scanner(System.in);
for(int i=0;i<z.length;i++)
{
System.out.print("Print the value of Z["+i+"]=");
z[i]=s.nextInt();
}
for(int i=0;i<z.length;i++)
{
System.out.println("The value of Z["+i+"]="+z[i]);
}
}
}