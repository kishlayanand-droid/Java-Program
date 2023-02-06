import java.util.*;
class que2
{
public static void main(String args[])
{
String s1,s2;
int t;
System.out.print("Enter test case number :");
t=s.nextInt();
Scanner sc=new Scanner(System.in);
System.out.print("Enter the first String :");
s1=s.nextLine();
System.out.print("Enter the second String :");
s2=s.nextLine();
int n=s1.length();
int m = s2.length();
int array1 []=new int [n];
int array2 []=new int [m];

for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
if(array1[i]==array2[j])
break;
else if(j==(m-1))
{
System.out.print(array1[i]);
break;
}
}
}

for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
if(array2[i]==array1[j])
break;
else if(j==(n-1))
{
System.out.print(array2[i]);
break;
}
}
}
}
}
