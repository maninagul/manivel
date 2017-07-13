package string;
import java.util.Scanner;
public class Binary {
public static void main(String[] args) {
	Scanner sn=new Scanner(System.in);
	int i=sn.nextInt();
	int j=sn.nextInt();
	String a = Integer.toBinaryString(i); 
	String b = Integer.toBinaryString(j);
	System.out.println("Binary value: "+a); 
	System.out.println("Binary value: "+b);

	}

}
