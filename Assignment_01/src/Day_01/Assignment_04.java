package Day_01;

public class Assignment_04 {
	//only constructor with this keyword
	public Assignment_04()
	{
		this(2,4,6);
		System.out.println("default constructor");
	}
	public Assignment_04(int a)
	{
		System.out.println("one parameterized constructor");
	}
	public Assignment_04(int a,int b)
	{
		System.out.println("two parameterized constructor");
	}
	public Assignment_04(int a,int b,int c)
	{
		System.out.println("three parameterized constructor");
	}
	public Assignment_04(int a,int b,int c,int d)
	{
		this(3,5);
		System.out.println("four parameterized constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment_04 a= new Assignment_04();
		Assignment_04 a1= new Assignment_04(2);
		Assignment_04 a2= new Assignment_04(3,4,2,5);
		
	}

}
