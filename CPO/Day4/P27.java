
class Test
{	//4 sum() we have defined
	static void sum(int x, int y)
	{	
		int z = x+y;
		System.out.println(z);
	}
	
	static void sum(float x, float y)
	{	
		float z = x+y;
		System.out.println(z);
	}
	
	static void sum(double x, double y)
	{	
		double z = x+y;
		System.out.println(z);
	}
	
	static void sum(double x, double y, double s)
	{	
		double z = x+y+s;
		System.out.println(z);
	}
	
}
class P27

{
	public static void main(String args[])
	{
		Test.sum(10,20);//1.data type
		Test.sum(10.34f,20.56f);//1.data type
		
		Test.sum(10.234567,20.4565787);//2.no of parameter
		//2.no of parameter
		Test.sum(10.345456546,20.45676878,30.56657687877);
	   
			
	}
}

