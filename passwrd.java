package string;
import java.util.Scanner;
public class passwrd {
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input1=s.next();
		int input2=s.nextInt();
		String s4=input1.substring(input1.length()-1);
		String s2=input1.substring(0,1).toLowerCase();
		String str=String.valueOf(input2);
		String s1=str.substring(0,1);
		int x,y=0,a,c=0;
		   while(input2>0){
	  		 x=input2%10;
	  		y=y+x;
	  		input2=input2/10;
		   }
			while(y>0) {
			   a=y%10;
		         c=c+a;
		         y=y/10;
		    }
	
System.out.println(s1+s2+c+s4);
		
		

	}

}
