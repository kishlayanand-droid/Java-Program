import java.util.Scanner;
class strlenwithoutlen
{
public static void main(String args[])
{
String str;
int length=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the String: ");
str=sc.next();
for(char c:str.toCharArray())
length++;
System.out.println("Lenght of a string is "+length);
}
}