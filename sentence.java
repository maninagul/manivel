package stringsentence;

import java.util.Scanner;

public class sentence {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);  
	     String s1=s.next();
	     String reverse=new StringBuffer(s1).reverse().toString();
	    System.out.println(reverse);
	}

}
