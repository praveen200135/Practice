package loops;

public class loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   int no=3;	

   for(int i=1;i<=3;i++)
   {
	   for(int k=1;k<=no-i;k++)
	   {
		   System.out.print(" ");
	   }
	   for(int j=1;j<=i;j++)
	   {
		   System.out.print("*");
	   }
	   System.out.println();
   }	
	}
}
