package guvi;
import java.util.Scanner;
public class StrChar {
public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   String str=s.nextLine();
   String a=str.substring(0,3);
   String b=str.substring(str.length()-2);
   System.out.println(a+'*'+b);
	}

}
