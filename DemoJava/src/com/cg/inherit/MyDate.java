package com.cg.inherit;

public class MyDate implements Cloneable {
	
	int dd,mm,yy;
	
	

	public MyDate(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	
	@Override
	public String toString() {
		return "MyDate [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}


	public void hello() 
	{
		System.out.println("Hello");
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		MyDate md=new MyDate(11,11,2011);
		System.out.println(md);

		
		MyDate md1=new MyDate(11,11,2011);
		
		System.out.println(md.equals(md1));
		System.out.println(md.hashCode());
		System.out.println(md1.hashCode());
		
		MyDate md2=(MyDate)md1.clone();
		System.out.println(md2);
		System.out.println(md2.hashCode());
		 //Test2 t2 = (Test2)t1.clone(); 
	}

}
