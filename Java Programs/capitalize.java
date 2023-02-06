import java.util.Scanner;
class capitalize
{
public static void main(String args[])
{
String str;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the string: ");
str=sc.nextLine();
for(int i=0;i<str.length();i++)
{
if(str[i]==0 || str[i-1]==' ')
str[i]=Character.toUpperCase(str[i]);

else if(str[i+1]==' ' || str[i+1]=='\0')
str[i]=Character.toUpperCase(str[i]);
}

System.out.println("After converting string is:"+str);
}
}