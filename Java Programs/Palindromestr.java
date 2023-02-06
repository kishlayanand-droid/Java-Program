import java.util.*;
class Palindromestr
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
if(str.equalsIgnoreCase(reverse))
System.out.println("String is Palindrome");
else
System.out.println("String is not Palindrome");
}
}
