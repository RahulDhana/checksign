import java.util.*;
class CheckAlpha1{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the value:");
char ch=scan.next().charAt(0);
if (Character.isLetter(ch))
System.out.println("Alphabet");
else
System.out.println("Not an alphabet");

}
}