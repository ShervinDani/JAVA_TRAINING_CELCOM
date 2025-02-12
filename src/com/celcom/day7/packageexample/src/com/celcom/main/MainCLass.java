package com.celcom.main;
import com.celcom.pack1.MyClass1;
import com.celcom.pack2.MyClass2;
// static imports
import static java.lang.Math.PI;
import static java.lang.System.out;
public class MainCLass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass1 obj1 = new MyClass1();
		obj1.myMethod1();
		obj1.myMethod3();
		MyClass2 obj2 = new MyClass2();
		obj2.myMethod4();
		out.println(PI);
	}

}
