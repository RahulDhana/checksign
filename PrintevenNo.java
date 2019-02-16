import java.util.*;
class PrintevenNo{
public static void main(String[] args ){
Scanner scan=new Scanner(System.in);
System.out.println("enter the intervals");
int a=scan.nextInt();
int b=scan.nextInt();
int x=a;
while((x>=a)&&(x<=b)){
if(x%2==0){
System.out.println(x+ " ");
}
else{
x++;
continue;
}
x++;}
}}

