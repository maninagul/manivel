package guvi;
public class Upper {
public static void main(String[] args) {
	String[] a={"goa","gujarat","kerala"};
	String[] b=new String[3];
	for(int i=0;i<a.length;i++)
	{
		b[i]=a[i].substring(0,3).toUpperCase();
		System.out.print("{"+b[i]+","+a[i]+"}");
		if(i<2)
		{
		System.out.print(",");
	}

}
}
}
