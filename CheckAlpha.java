import java.util.*;
class CheckAlpha{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
char ch=scan.next().charAt(0);
if ((ch>64&&ch<91)||(ch>96&&ch<123))
System.out.print("Alphabet");
else
System.out.print("Not an alphabet");

}
}