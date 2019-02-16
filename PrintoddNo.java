import java.util.*;
class PrintoddNo{
public static void main(String[] args ){
Scanner scan=new Scanner(System.in);
System.out.println("enter the intervals");
int a=scan.nextInt();
int b=scan.nextInt();
int x=a;
while((x>=a)&&(x<=b)){
if(x%2==0){
x++;
continue;}
else
System.out.println(x+ " ");
x++;}
}}

