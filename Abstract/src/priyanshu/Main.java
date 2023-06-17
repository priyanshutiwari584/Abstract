package priyanshu;

/*
 * Abstract class is a class which contains the static,non-static and Abstract method.
 * Abstract class can be created by the abstract keyword before the class name.
 * E.g:-"abstract class A",here abstract keyword denotes the class is abstract class. 
 */
abstract class A {
	// Non static method.
	// It is instantiated by creating the object of class.
	public int add(int a, int b) {
		return a + b;
	}

	// Static method .
	// It can instantiated by without creating the object of class by using the
	// class name.
	static int sum(int m, int n) {
		return m + n;
	}

	// Abstract method.
	// It doesn't contain the body of method.
	// To provide body of this method it is extended into the normal class.
	// Abstract method can be extended to the normal class using the extends keyword. 
	abstract int sub(int a, int b);
}

interface B {
	// Interface is purely abstract class.
	// It only contain the abstract method.
	// Interface can be created using the interface keyword before the class name,
	// here class keyword is not be used,directly the class name is defined.
	// E.g:- "interface B"
	// The Variable of the interface is public static final.
	// Interface can be implements to the normal class using the implements keyword.
	public void show();

}

//Class to Override the abstract method of the interface class.
class C implements B {
	@Override
	public void show() {
		
		System.out.println("Interface Method.");
	}

}

public class Main extends A {

	public static void main(String[] args) {
		//Creating the object of the class.
		Main a = new Main();
		// calling the Non Static method.
		System.out.println("Non static method:" + a.add(10, 10));
		// calling the Static Method by using class name.
		System.out.println("Static method:" + A.sum(10, 20));
		// calling the Abstract Method by override it into normal class.
		System.out.println("Abstract method:" + a.sub(10, 100));

		//creating the Object of class c to implement the interface class B
		C ob = new C();
		ob.show();

	}

//Abstract method override in normal class to provide the body of the method. 
	@Override
	int sub(int a, int b) {
		System.out.println("Abstract Method");
		return a - b;
	}
}

