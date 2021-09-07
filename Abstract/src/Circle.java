
public class Circle extends A implements Shape{
	private double a;
	public void FindArea() {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Circle's Area: Enter radius-");
		double r= sc.nextDouble();
		
		a=3.14*r*r;
		
	}
	public void PrintArea()
	{
		System.out.println("Circle's Area:" +a);
	}

}
