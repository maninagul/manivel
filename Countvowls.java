package guvi;
import java.util.Scanner;
public class Countvowls {

	public static void main(String[] args) {
		String e;
		int count=0;
		char c;
		Scanner s=new Scanner(System.in);
		e=s.next();
		for(int i=0;i<e.length();i++){
			c=e.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
				count++;
				
			}
		}
		System.out.println("no of vowels is:"+count);
        s.close();
	}

}
