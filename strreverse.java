package string;
import java.util.Scanner;
public class strreverse {
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String rev="";
		int n=str.length();
		for(int i=n-1;i>=0;i--) {
			rev=rev+str.charAt(i)+"-";
		}
		System.out.println(rev);

	}

}
