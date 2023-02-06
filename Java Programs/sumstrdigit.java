import java.util.Scanner;
class sumstrdigit
{
public static void main(String args[])
{
String str;
int sum=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the string :");
str=sc.nextLine();
for(int i=0;i<str.length();i++)
{
if(Character.isDigit(str.charAt(i)))
sum=sum+Character.getNumericValue(str.charAt(i));
}
System.out.println("sum of digit present in string: "+sum);
}
}