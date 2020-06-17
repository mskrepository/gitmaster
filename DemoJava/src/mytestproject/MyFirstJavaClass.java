package mytestproject;

public class MyFirstJavaClass {

	int a;
	float b;
	char c;
	double d;

	
	public MyFirstJavaClass() 
	{
		a=10;
		b=20.0f;
		c='A';
		d=100.100;
	}
	
	public MyFirstJavaClass(int a1, float b1, char c1, double d1) 
	{
		a=a1;
		b=b1;
		c=c1;
		d=d1;
	}
	
	
	
	
	public void print() 
	{
		
		System.out.println("From print method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
			}
	
	public void hello() 
	{
		
		System.out.println("hello...!..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MyFirstJavaClass obj=new MyFirstJavaClass();
		
		obj.print();
		obj.hello();
		
		MyFirstJavaClass obj1=new MyFirstJavaClass(10,21.0f,'B',200);
		obj1.print();
		

	}

}
