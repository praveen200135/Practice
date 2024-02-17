package Day_01;

public class Day_03 {

	//(((10/2)-2)+2)-2)/2)
	
	public double Div(double t,double i)
    {
    	double h;
    	h=t/i;
    	return h;
    }
	 public double sub(double y,double z)
	    {
	    	double c;
	    	c=y-z;
	    	return c;
	    }
	 public double sum(double a,double b)
		{
			double p;
			p=a+b;
			return p;
		}
	 public double sub1(double y,double z)
	    {
	    	double c;
	    	c=y-z;
	    	return c;
	    }
	 public double Div1(double t,double i)
	    {
	    	double h;
	    	h=t/i;
	    	return h;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Day_03 d= new Day_03();
		double S=d.Div(10, 2);
		double r=d.sub(S, 2);
		double t=d.sum(r, 2);
		double h=d.sub1(t, 2);
		double y=d.Div1(h, 2);
		
		System.out.println("the o/p is"+y);
	}

}
