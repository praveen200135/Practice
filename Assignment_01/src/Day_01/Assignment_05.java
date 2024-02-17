package Day_01;

public class Assignment_05 {

	public void m()
	{
		System.out.println("default method");
	}
	public void m1(int a)
	{
		System.out.println("one parameterized method");
	}
	public void m2(int a,int b)
	{
		System.out.println("two parameterized method");
	}
	public void m3(int a,int b,int c)
	{
		System.out.println("Three parameterized method");
	}
	public void m4(int a,int b,int c,int d)
	{
		this.m3(4, 7, 6);
		
		System.out.println("four parameterized method");
		this.m();
		this.m1(2);
		this.m2(4, 6);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment_05 a= new Assignment_05();
		a.m4(2, 4, 6, 8);
	}

}
