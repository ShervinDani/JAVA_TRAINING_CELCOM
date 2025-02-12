package com.celcom.day7;

// Anonymous Innerclass
interface MyInterface
{
	void display();
}
public class InnerClassExample1 {

	// 1. Non - Static InnerClass
	class InnerClass1{
		void myMethod()
		{
			System.out.println("Inner Class");
		}
	}
	
	// 2. Static InnerClass
	static class InnerClass2
	{
		int a = 10;
		void myMethod2()
		{
			System.out.println("Static Inner Class " + a);
		}
	}
	
	//3. Local InnerClass
	void myMethod()
	{
		class InnerClass3
		{
			void myMethod3() {
				System.out.println("Local Inner Class");
			}
		}
		InnerClass3 innerclass3 = new InnerClass3();
		innerclass3.myMethod3();
	}
	public static void main(String[] args) {
		InnerClassExample1 obj = new InnerClassExample1();
		InnerClass1 innerclass = obj.new InnerClass1();
		innerclass.myMethod();
		InnerClass2 innerclass2 = new InnerClass2();
		innerclass2.a++;
		innerclass2.myMethod2();
		System.out.println("Stop");
		InnerClassExample1.InnerClass2 innerclass3 = new InnerClassExample1.InnerClass2();
		innerclass3.myMethod2();
		obj.myMethod();
		
		
		// Anonymous InnerClass
		MyInterface obj3 = new MyInterface(){

			@Override
			public void display() {
				// TODO Auto-generated method stub
				System.out.println("Inside Anonymous InnerClass");
			}
			
		};
		obj3.display();

		//lambda Expression
		MyInterface obj4 = ()->{System.out.println("Display type 2");
		System.out.println("Second Line");
		};
		obj4.display();
	}

}
