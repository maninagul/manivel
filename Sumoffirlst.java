package guvi;
import java.util.Scanner;
public class Sumoffirlst {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String a=str.substring(0,1);
		String b=str.substring(str.length()-1);
		int a1=Integer.parseInt(a);
		int b1=Integer.parseInt(b);
		int c=a1+b1;
		System.out.println(c);

	}

}
