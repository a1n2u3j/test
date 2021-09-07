
public class Square extends A implements Shape {
private double a;
	
	public void FindArea()
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Square's Area: Enter side-");
		double s= sc.nextDouble();
		
		a=s*s;
		
	}
	public void PrintArea()
	{
		System.out.println("Square's Area:" +a);
	}

}
