package string;
import java.util.Scanner;
public class Sqrsum {

	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      int b,c=0,n;
      while(a>0) {
    	 b=a%10;
    	 n=b*b;
    	 c=c+n;
    	 a=a/10;
      }
      System.out.println(c);
	}

}
