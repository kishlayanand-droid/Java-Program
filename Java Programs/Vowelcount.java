import java.util.*;
class Vowelcount
{
public static void main(String args[])
{
String str;
int vowels=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter a String:");
str=s.nextLine();
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
vowels++;
}
}
System.out.print("Number of vowels="+vowels);
}
}
