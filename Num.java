package guvi;
import java.util.Scanner;
public class Num {
public static void main(String[] args) {
	Scanner sn=new Scanner(System.in);
	
	int number=sn.nextInt();
	int digit,rem,odd=0;
	while(number>0){
        digit = number % 10;
        number = number / 10;
        rem = digit % 2;
        if(rem != 0)
        odd=odd+digit;
        else
        continue;
        }
	System.out.println("Sum:"+odd);
	if(odd%2!=0) {
		System.out.println("oddnumber");
	}
		
sn.close();
	}

}
