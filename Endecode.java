package string;

public class Endecode {

	public static void main(String[] args) {
		String str="java";
		char ch=(char)(str.charAt(0)-1);
		char ch1=(char)(str.charAt(1)+25);
		char ch2=(char)(str.charAt(2)-1);
		char ch3=(str.charAt(3));
		System.out.println(ch+""+ch1+""+ch2+""+ch3);

	}

}
