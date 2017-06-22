package sumpalindrome;

public class spal {

	public static void main(String[] args) {
		  int input=60;
		  int sum=0;
		  for(int i=1;i<=60;i++){
			  sum=sum+i;
		 }
		   System.out.println(+sum);
	
					int t,r,p=0;
					int n=1830;
					t=p;
					while(n>0){
						r=n%10;
						t=(t*10)+r;
						n=n/10;
					}
					if(t==sum){
						System.out.println("palindrome");
					}
					else
					{
						System.out.println("not a palindrome");
					}
					

				}

			}

		

		

	


