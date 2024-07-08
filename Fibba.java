package loops;

public class Fibba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fib=0;
		int fib1 =1;
		
		System.out.print(fib+" "+fib1);
		
		for(int i=0;i<=10;i++)
		{
		int fib2=fib1+fib;
		
		System.out.print(" "+fib2);
		
		
		fib=fib1;
		fib1=fib2;
		
		
		}	
		
	}

}
