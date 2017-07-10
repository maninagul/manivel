package string;

public class Substr {

	public static void main(String[] args) {
		String s1="test123string";
		String s2="123";

		int index=s1.indexOf(s2.toString());
		if(index==-1)
		{
		    System.out.println("1");
		}else{
	System.out.println(index);
		}
	}

}
