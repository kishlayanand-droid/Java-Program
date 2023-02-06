import java.util.Scanner;
class removespace
{
public static void main(String args[])
{
String str,str1="";
Scanner sc=new Scanner(System.in);
System.out.print("Enter the string :");
str=sc.nextLine();
for(int i=0;i<str.length();i++)
if(str.charAt(i)!=' ')
str1=str1+str.charAt(i);
System.out.println("String without space "+str1);
}
}