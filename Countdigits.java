import java.util.*;
class Countdigits{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the value of N:");
int N=scan.nextInt();
int count=0;
while(N!=0){
N=N/10;
count++;
}
System.out.println("output:"+count);
}
}