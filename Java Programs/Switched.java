import java.util.*;
class Switched
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
int a; String day;
System.out.println("Enter no. of day=");
a=obj.nextInt();
switch (a)
{
case 1:
day="sunday";
break;
case 2:
day="monday";
break;
case 3:
day="tuesday";
break;
case 4:
day="wednesday";
break;
case 5:
day="thursday";
break;
case 6:
day="friday";
break;
case 7:
day="saturday";
break;
default:
day="invalid";
break;
}
System.out.println("Day=" +day);
}
}
