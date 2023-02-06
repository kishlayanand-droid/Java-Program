import java.util.*;
class Marksarray
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of Students-");
n=sc.nextInt();
int[] marks=new int[n];
for(int i=0;i<n;i++)
{
System.out.print("Enter the value of marks["+i+"]=");
marks[i]=sc.nextInt();
}
System.out.println("Marks of students given below");
int i=0;
while(i<n)
{
int num=marks[i];
System.out.print(num+"\t");
i++;
}
}
}