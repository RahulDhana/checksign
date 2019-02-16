import java.util.*;
class LeapYear{
public static void main(String[] args){
System.out.print("Enter a year:");
Scanner scan=new Scanner(System.in);
int year=scan.nextInt();
if (year%4==0)
if(year%100==0)
if(year%400==0)
System.out.println(year+" is leap");
else
System.out.println("not");
else
System.out.println("leap");
else
System.out.println(year+" is not leap");
}
}
