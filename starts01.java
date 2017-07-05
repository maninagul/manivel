package string;
public class starts01 {
public static void main(String args[]) {
        String[] s ={"This is an example for this question"};
        s[1]="This";
        s[2]="is";
        s[3]="an";
        s[4]="example";
        s[5]="for";
        s[6]="this";
        s[7]="question";
        String ss1=new StringBuffer(s[1]).reverse().toString();
        String ss3=new StringBuffer(s[3]).reverse().toString();
        String ss5=new StringBuffer(s[5]).reverse().toString();
        String ss7=new StringBuffer(s[7]).reverse().toString();
        
     System.out.println(ss1+(s[2])+ss3+(s[4])+ss5+(s[6])+ss7);   
		
 
	}

}
