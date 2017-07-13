package string;
import java.util.Scanner;
import java.util.Arrays;
public class Strsort {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		String s=sn.nextLine();
		String[] s1=s.split(" ");
		 for(int i=0;i<s1.length;i++)
		 {
		     char[] a=s1[i].toCharArray();
		            Arrays.sort(a);
		            System.out.println(a);
		 }

	}

}
