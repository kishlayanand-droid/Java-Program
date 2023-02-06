import java.util.Scanner;
class strreplacesubstring
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the String :");
String str=sc.nextLine();
System.out.print("Enter the string to be replaced: ");
String oldstr=sc.nextLine();
System.out.print("Enter the new string :");
String newstr=sc.nextLine();
String replacedstring=str.replace(oldstr,newstr);
System.out.print("New string :"+replacedstring);
}
}