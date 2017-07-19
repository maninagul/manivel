package guvi;
import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    String s1=s.nextLine();
    String s2=s.nextLine();
     char ch1[]=s1.toLowerCase().toCharArray();
    char ch2[]=s2.toLowerCase().toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    if(Arrays.equals(ch1,ch2))
    {
        System.out.print("Anagram");
    }else{
        System.out.print("Not Anagram");
    }

	}

}
