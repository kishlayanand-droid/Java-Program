import java.util.Scanner;
class Togglestr
{
public static void main(String args[])
{
String str;
String str1="";
Scanner sc=new Scanner(System.in);
System.out.print("Enter the String: ");
str=sc.nextLine();
for(int i=0;i<str.length();i++)
{
if(Character.isUpperCase(str.charAt(i)))
	str1=str1+Character.toLowerCase(str.charAt(i));
else
	str1=str1+Character.toUpperCase(str.charAt(i));
}
System.out.println("Toggled String is "+str1);
}
}