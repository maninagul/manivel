package string;
import java.util.Scanner;
public class Strdate {
public static void main(String[] args) {
	String s="09:30 am";
	String str=s.substring(0,s.length()-2);
		if(s.substring(s.length()-2).equals("am")){
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
