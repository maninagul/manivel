package string;

public class Area {

	public static void main(String[] args) {
		maths a=new maths();
		a.area(5);
		a.area(5,6);
		a.area(1.3);}
	}
	class maths{
		void area(float m)
		{
		System.out.println("area of square is:"+Math.pow(m,2));
		}
		void area(float m,float n)
		{
      System.out.println("area of rectangle is:"+(m*n));
		}
      void area(double m) {
    	  double l=3.14*m*m;
    	  System.out.println("area of circle is:"+l);
    	  
      }
	}


