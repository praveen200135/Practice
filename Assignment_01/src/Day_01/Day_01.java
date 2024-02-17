package Day_01;

public class Day_01 {
	
	int rollno=20;
	int age=40;
	
	 void display()
	{
		System.out.println("Welcome to all");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Day_01 d =new Day_01();
      System.out.println("rollno of student"+d.rollno);
      d.age=60;
      System.out.println("Age of student"+d.age);
      d.display();
      d.display1();	
	}
	void display1()
	{
		System.out.println("Automation is easy");
	}

}
