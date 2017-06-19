 class palin {

	public static void main(String[] args) {
		int t,r,sum=0;
		int n=1234;
		t=n;
		while(n>0){
			r=n%10;
			sum=(sum*10)+r;
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
