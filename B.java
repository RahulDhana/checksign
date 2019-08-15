import java.util.*;
class A{

int isEven(int n){
if(n%2==0)
return 2;
else
return 1;
}
}
class B{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
A obj=new A();
if(obj.isEven(a)==2)
System.out.print("2");
else
System.out.print("1");
}}





