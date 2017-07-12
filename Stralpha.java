package string;
import java.util.Scanner;
public class Stralpha {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String b=str.replaceAll("[bcdefghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]","");
		String c=str.replaceAll("[aeiouAEIOU]","");
		System.out.println(b+c);
		}
		}

	


