import java.util.Scanner;
class removevowel
{
public static void main(String args[])
{
String str,str1="";
Scanner sc=new Scanner(System.in);
System.out.print("Enter the string: ");
str=sc.nextLine();
str1=str.replaceAll("[aeiou]", "");
str1=str.replaceAll("[^a-zA-Z]", "");
System.out.println("String after removing vowels: "+str1);
}
}