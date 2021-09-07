
public class Rectangle extends A implements Shape {
	 private int a;
	public void FindArea() {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Rectangle's Area: Enter length and Breadth-");
		int l= sc.nextInt();
		int b= sc.nextInt();
		
		a=l*b;
		
	}
	public void PrintArea()
	{
		System.out.println("Rectangle's Area:" +a);
	
         show();
	}
}
