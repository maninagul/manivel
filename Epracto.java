package guvi;
import java.util.Scanner;
public class Epracto {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	  String str=s.nextLine();
	  String s1=str.replaceAll("[a]","");
	  String s2=str.substring(0,1);
	  //String s3[]=str.split(" ");
	  char arraystr[]=str.toCharArray();
	  int length=str.length();
	  //int count=0;
	  int acount=0;
	  int bcount=0;
	  int ccount=0;
	  int dcount=0;
	  int ecount=0;
	  int fcount=0;
	  int gcount=0;
	  int hcount=0;
	  int icount=0;
	  int jcount=0;
	  int kcount=0;
	  int lcount=0;
	  int mcount=0;
	  int ncount=0;
	  int ocount=0;
	  int pcount=0;
	  int qcount=0;
	  int rcount=0;
	  int scount=0;
	  int tcount=0;
	  int ucount=0;
	  int vcount=0;
	  int wcount=0;
	  int xcount=0;
	  int ycount=0;
	  int zcount=0;
	 for(int i=0;i<length;i++){
	    char c=arraystr[i];
	   switch(c)
	   {
	     case 'a':
	       acount++;
	       break;
	     case 'b':
	       bcount++;
	       break;
	     case 'c':
	       ccount++;
	       break;
	     case 'd':
	       dcount++;
	       break;
	     case 'e':
	       ecount++;
	       break;
	     case 'f':
	       fcount++;
	       break;
	     case 'g':
	       gcount++;
	       break;
	     case 'h':
	       hcount++;
	       break;
	     case 'i':
	       icount++;
	       break;
	     case 'j':
	       jcount++;
	       break;
	     case 'k':
	       kcount++;
	       break;
	     case 'l':
	       lcount++;
	       break;
	     case 'm':
	       mcount++;
	       break;
	     case 'n':
	       ncount++;
	       break;
	     case 'o':
	       ocount++;
	       break;
	     case 'p':
	       pcount++;
	       break;
	     case 'q':
	       qcount++;
	       break;
	     case 'r':
	       rcount++;
	     case 's':
	       scount++;
	       break;
	     case 't':
	       tcount++;
	       break;
	     case 'u':
	       ucount++;
	       break;
	     case 'v':
	       vcount++;
	       break;
	     case 'w':
	       wcount++;
	       break;
	     case 'x':
	       xcount++;
	       break;
	     case 'y':
	       ycount++;
	       break;
	     case 'z':
	       zcount++;
	       break;
	   }
	    
	  }
	  //System.out.println(s2+acount+s1);
	  System.out.println(hcount);
	  
	  }
	

}
