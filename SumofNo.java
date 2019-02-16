import java.util.*;
class SumofNo{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the value of N:");
int N=scan.nextInt();
int Sum=0;
int x=1;
while(x<=N){
Sum=Sum+x;
x++;
}
System.out.println("sum is:"+Sum);
}
}
 
