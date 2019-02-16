import java.util.*;
class GreatestNo{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter first no:");
int a=scan.nextInt();
System.out.println("Enter second no:");
int b=scan.nextInt();
System.out.println("Enter third no:");
int c=scan.nextInt();
if(a>b&&a>c)
System.out.println(a+" is Greatest");
else if(b>c)
System.out.println(b+" is Greatest");
else
System.out.println(c+" is Greatest");
}
}
