package guvi;
import java.util.Scanner;
public class Sumdig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int y=0;
while(a>0) {
	y=y+a;
	a--;
}
System.out.println(y);
		
	}

}
