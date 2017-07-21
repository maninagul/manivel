package guvi;
import java.util.Scanner;
public class Split {
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
        String a[]=str.split(" ");
        System.out.println(a[0]+" "+a[1]+" "+a[2]);
        System.out.println(a[3]+" "+a[4]+" "+a[5]);
        System.out.println(a[6]);
	}

}
