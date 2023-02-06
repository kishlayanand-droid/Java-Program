import java.util.Scanner;
class strfirstnonrepeat
{
public static void main(String args[])
{
String str;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the string :");
str=sc.nextLine();

for(int i=0;i<str.length();i++)
{
int count=0;
for(int j=0;j<str.length();j++)
if(str.charAt(i)==str.charAt(j))
count++;

if(count==1)
{
System.out.println("The first non repeating character in string: "+str.charAt(i));
break;
}
}
}
}

