package string;
import java.util.Scanner;
public class Checkstr {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.next();
	String s2=s.next();
	char ch[]=s2.toCharArray();
	for(int i=0;i<s2.length();i++)
	{
		if(s1.contains(String.valueOf(ch[i]))) {
    System.out.println("true");
	}
		else {
			System.out.println("false");
		}
	}

}
}
