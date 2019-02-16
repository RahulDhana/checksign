import java.util.*;
class FactofNo{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the value of N:");
int N=scan.nextInt();
int fact=1;
int x=1;
while(x<=N){
fact=fact*x;
x++;
}
System.out.println("Fact is:"+fact);
}
}
 
