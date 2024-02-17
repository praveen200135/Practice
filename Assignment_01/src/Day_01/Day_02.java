package Day_01;

public class Day_02 {
	//((((10+2)+2)-2)*2/2)

	public double sum(double a,double b)
	{
		double p;
		p=a+b;
		return p;
	}
    public double sub(double y,double z)
    {
    	double c;
    	c=y-z;
    	return c;
    }
    public double mul(double t,double i)
    {
    	double h;
    	h=t*i;
    	return h;
    }
    public double Div(double t,double i)
    {
    	double h;
    	h=t/i;
    	return h;
    }	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Day_02 Q = new Day_02();
		double e=Q.sum(10,2);
		double r=Q.sum(e,2);
		double y=Q.sub(r,2);
		double s=Q.mul(y, 2);
	           double h=Q.Div(s, 2);
	           
	           System.out.println("The output is:"+h);	
	}

}
