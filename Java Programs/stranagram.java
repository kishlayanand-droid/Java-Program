import java.util.Scanner;
import java.util.Arrays;
class stranagram
{
public static void main(String args[])
{
String str1,str2;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the first String :");
str1=sc.nextLine();
System.out.print("Enter the second String :");
str2=sc.nextLine();

str1=str1.toLowerCase();
str2=str2.toLowerCase();

if(str1.length()==str2.length())
{
char[] array1=str1.toCharArray();
char[] array2=str2.toCharArray();

Arrays.sort(array1);
Arrays.sort(array2);
boolean result=Arrays.equals(array1,array2);
if(result)
System.out.println("The Strings "+str1+" and "+str2+" are Anagram");
else
System.out.println("The Strings "+str1+" and "+str2+" are not Anagram");
}
else
System.out.println("The Strings "+str1+" and "+str2+" are not Anagram");
}
}