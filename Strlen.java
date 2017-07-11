package string;
import java.util.Scanner;
public class Strlen {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		String str=sn.nextLine();
		String str1=sn.nextLine();
        int a=str.length();
        int b=str1.length();
        if(a==b) {
        	System.out.println(str+str1);
        	}
         else if(a>b) {
        	System.out.println(str.substring(str.length()-b)+str1.substring(0));
        }
         else if(b>a) {
         	System.out.println(str.substring(0)+str1.substring(str1.length()-a));
         }	
         else {
        	 String c=str.concat(str1);
        	 System.out.println(c);
         }
	}
	
	
}