import java.util.*;
class printasterisk{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number of asterisk");
int N=scan.nextInt();
for(int a=1;a<=N;a++){
for(int b=1;b<=a;b++){
System.out.print("*");
}
for(int c=a+1;c<=N;c++){
System.out.print(" ");
}
System.out.println();
}
}
}
