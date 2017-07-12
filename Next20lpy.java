package string;
import java.util.Scanner;
public class Next20lpy {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int y=in.nextInt();
		if(y%4==0) {
		for(int i=1;i<=20;i++)
		{
		y+=4;
		System.out.println(y);

	}
		}
}
}
