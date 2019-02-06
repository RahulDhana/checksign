import java.util.*;
class checksign{
public static void main(String[] args){
int a;
Scanner scan=new Scanner(System.in);
System.out.print("enter the numer:");
a=scan.nextInt();
if(a==0){
System.out.print("number is zero");
}
else if(a<0){
System.out.print("number is negative");
}
else{
System.out.print("number is positive");
}
}
}

