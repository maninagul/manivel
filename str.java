package string;

public class str {

	public static void main(String[] args) {
	               String s ="acvbbr"; 
		          int l = s.length();
		          char ch;
		          String ans="";
		           
		          for(int i=0; i<l; i++)
		          {
		              ch = s.charAt(i);
		              if(ch!=' ')
		                  ans = ans + ch;
		              s = s.replace(ch,' '); 
		          }
		   
		         System.out.println(ans);
		         int l1=ans.length();
		         System.out.println(l1);
		      }
		  

	}


