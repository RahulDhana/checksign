import java.util.*;
class CheckAlpha0{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the value:");
char ch=scan.next().toUpperCase().charAt(0);
if (ch>64&&ch<91)
System.out.print("Alphabet");
else
System.out.print("Not an alphabet");

}
}