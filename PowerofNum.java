import java.util.*;
class PowerofNum{
public static void main(String[] args ){
Scanner scan=new Scanner(System.in);
System.out.print("Enter the value of N:");
int N=scan.nextInt();
System.out.print("Enter the value of K:");
int K=scan.nextInt();
int result=1;
int i=1;
while(i<=K){
result=result*N;
i++;
}
System.out.println("The power is:"+result);
}
}
