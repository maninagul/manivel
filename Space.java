package string;

public class Space {

	public static void main(String[] args) {
		String s="This   is a    wrong   statement";
		s=s.replaceAll("\\s+", " ");
		System.out.println(s); 


	}

}
