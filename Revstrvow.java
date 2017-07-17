package guvi;
import java.util.Scanner;
public class Revstrvow {
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String rev=new StringBuffer(str).reverse().toString();
		String s1=rev.replaceAll("[aeiou]", "");
		System.out.println(rev);
		System.out.println(s1);

	}

}
