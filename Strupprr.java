package string;
import java.util.Scanner;
public class Strupprr {
public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		String str=s.next();
		String ss=str.substring(1,2).toUpperCase();
		System.out.println(str.substring(0,1)+ss+str.substring(2));
	}

}
