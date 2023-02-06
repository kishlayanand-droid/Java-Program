import java.util.*;
class Bhu
{
public static void main(String args[])
{
int c=1,temp=0;
int[] z=new int[5];
Scanner s=new Scanner(System.in);
for(int i=0;i<z.length;i++)
{
System.out.print("Print the value of Z["+i+"]=");
z[i]=s.nextInt();
}
for(int i=0;i<z.length;i++)
{
temp+=c*z[i];
c++;
}
System.out.println(temp);
}
}