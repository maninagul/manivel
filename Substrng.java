package guvi;
import java.util.Scanner;
public class Substrng {

	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       String str=s.nextLine();
       String str1=s.nextLine();
       if(str1.contains(str)){
       System.out.println("yes");
       }else{
       System.out.println("no");
       }
	}

}
