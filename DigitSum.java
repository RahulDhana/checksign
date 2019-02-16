import java.util.*;
class DigitSum{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the value of N:");
int N=scan.nextInt();
int count=0;
int sum=0,v;
while(N!=0){
v=N%10;
sum=sum+v;
N=N/10;
count++;
}
System.out.println("count is:"+count);
System.out.println("sum is:"+sum);
}
}