import java.util.*;
class Palindrome
{
public static void main(String args[])
{
int n,r,sum=0,temp;
Scanner s=new Scanner(System.in);
System.out.print("Enter a number to check a palindrome=");
n=s.nextInt();
temp=n;
while(n>0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum)
System.out.print(s+" is a palindrome number");
else 
System.out.print(s+" is not a palindrome number");
}
}