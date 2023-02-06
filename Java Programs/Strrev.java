import java.util.*;
class Strrev
{
public static void main(String args[])
{
String str,reverse="";
Scanner s=new Scanner(System.in);
System.out.print("Enter a String to reverse:");
str=s.nextLine();
for(int i=str.length()-1;i>=0;i--)
{
reverse=reverse+str.charAt(i);
}
System.out.print("Reversed String:"+reverse);
}
}
