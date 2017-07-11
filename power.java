package string;
public class power {

	public static void main(String[] args) {
		String s="This   is a    wromg   statement";
		s=s.replaceAll("\\s+", " ");
		System.out.println(s); 

	}

}
