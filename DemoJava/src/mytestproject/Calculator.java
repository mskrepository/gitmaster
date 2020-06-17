package mytestproject;

public class Calculator {

	int num1;
	int num2;
	

	 public Calculator() 
	 {
		 num1=10;
		 num2=10;
		 
	 }
	 
	 public Calculator(int n1, int n2) 
	 {
		 num1=n1;
		 num2=n2;
		 
	 }
	
	public void add()
	{
		
		System.out.println("num1+num2="+(num1+num2));
	}
	
	
	public void sub()
	{
		System.out.println("num1-num2="+(num1-num2));
	}
	
	public void mul()
	{
		System.out.println("num1*num2="+(num1*num2));
	}
	
	public void div()
	{
		System.out.println("num1/num2="+(num1/num2));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calc=new Calculator();
		
		System.out.println("\n");
		System.out.println("num1="+calc.num1);
		System.out.println("num2="+calc.num2);
		System.out.println("\n");
			
		calc.add();
		calc.sub();
		calc.mul();
		calc.div();
		System.out.println("\n");
		
		Calculator calc1=new Calculator(30,20);
		calc1.add();
		calc1.sub();
		calc1.mul();
		calc1.div();
		
		
		
	}
	
	

}
