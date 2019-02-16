import java.util.*;
class Palindrome{
public static void main(String[] args ){
Scanner scan=new Scanner(System.in);
System.out.print("Enter the value of N:");
int N=scan.nextInt();
int temp=N;
int rev=0;
while(temp!=0){
rev=rev*10+temp%10;
temp=temp/10;
}
if(rev==N)
System.out.println("Number is palindrome");
else
System.out.println("Number is not palindrome");
}
}
