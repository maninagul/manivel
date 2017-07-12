package string;

public class Upplow {

	public static void main(String[] args) {
		String s="heLLo";
		String s1=s.substring(0,2).toUpperCase();
		String s2=s.substring(s.length()-1).toUpperCase();
		String s3=s.substring(2,4).toLowerCase();
   System.out.println(s1+s3+s2);
	}

}
