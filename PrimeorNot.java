import java.util.*;
class PrimeorNot{
public static void main(String[] args ){
Scanner scan=new Scanner(System.in);
System.out.print("Enter the value of N:");
int N=scan.nextInt();
int flag=0;
if(N==0||N==1)
flag=1;
else{
for(int i=2;i<N/2;i++){
if(N%i==0){
flag=1;
break;}
else
continue;}}
if(flag==0)
System.out.println("prime");
else 
System.out.println("not a prime");
}
}
