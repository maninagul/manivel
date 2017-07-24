package guvi;
import java.util.Scanner;
public class Sumoddno {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<=n;i++){
		if(i%2!=0){
		sum+=i;	
		}
			}
		System.out.println(sum);

	}

}
