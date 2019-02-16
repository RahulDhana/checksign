import java.util.*;
class VowelConsonant{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter character:");
char ch=scan.next().toLowerCase().charAt(0);
if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
System.out.println("vowel");
}
else{
System.out.println("consonant");
}
}
}