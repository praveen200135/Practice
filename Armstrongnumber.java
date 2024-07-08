package loops;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p=153;		
		int a=p;
		  int temp=0; 	  
		while(a!=0)
		{
		int no=a%10;
		  temp=temp+(no*no*no);
		    a=a/10;	        
		}
	if(temp==p)
	{
		System.out.println("it is a armstrong number"+ p);
	}
	else
	{
		System.out.println("it is not a armstrang number");
	}
	
	}
}
