package Lamda;

public class Main 
{
	public static void main(String[] args) 
	{
		System.out.println("This is practice of lamda expession");
		
		MyInter m1 = new MyInter()
		{
			@Override
			public  void sayhello()
			{
				System.out.println("This is first anonymous Class");
			}
		};
		m1.sayhello();

		MyInter m2 =new MyInter()
		{
			public void sayhello()
			{
				System.out.println("This is a second anonymous class");
			}
		};
		m2.sayhello();
		MyInter m3 = new MyInter()
		{
			@Override
			public  void sayhello()
			{
				System.out.println("This is third anonymous Class");
			}
		};
		m3.sayhello();
		
		Inter i1=new Inter()
				{
			public void saybye()
			{
				System.out.println("This is second interface ");
			}
				};
				i1.saybye();
				
				Return r=(a,b)->a+b;
				
				System.out.println(r.sum(4, 5));
				System.out.println(r.sum(5, 5));
				
				Mystring my1=(str)->str.length();
				System.out.println(my1.getlength("The len"));

		
		
		
		
		
		
	
//	@Override
//	MyInter m=new MyInter();
//	{
//		public abstarct void sayhello()
//		{
//			System.out.println("THis is print 1st");
//		}
//	};
}}
