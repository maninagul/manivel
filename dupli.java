package string;

public class dupli {

	public static void main(String[] args) {
		String s="aaabbcccccddd";
		int l=s.length();
		char ch;
		String s1="";
		for(int i=0;i<l;i++)
		{
			ch=s.charAt(i);
			if(ch!=' '){
				s1=s1+ch;
				s=s.replace(ch, ' ');
			}
		}System.out.println(s1);

	}

}
