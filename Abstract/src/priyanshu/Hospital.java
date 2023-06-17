package priyanshu;

//Class Doc which extends the Abstract class Add on.
class Doc extends Addon {
	int id;
	String Name;
	int salary;

	// Override abstract method to provide body.
	@Override
	void Salary() {
		id = 1121;
		Name = "Priyanshu";
		salary = 200000;
		System.out.println("Doctor Name:" + Name + "\n" + "Id:" + id);
		System.out.println("Doctor salary:" + salary);

	}

	// Override abstract method to provide body.
	@Override
	int Salary(int bonus) {
		salary = salary + bonus;
		System.out.println("Doctor Bonus:"+bonus);
		System.out.println("Doctor Salary with bonus:");
		return salary;
	}

}

//Class Nurse which extends the Abstract class Add on.
class Nurse extends Addon {
	int id;
	String Name;
	int salary;

	// Override abstract method to provide body.
	@Override
	void Salary() {
		id = 111;
		Name = "Rakesh";
		int tax = 2000;
		salary = 40000 - tax;
		System.out.println("Nurse Name:" + Name + "\n" + "Id:" + id);
		System.out.println("Nurse Salary with tax Deduction:" + salary);
		System.out.println("Nurse Tax:"+tax);
	}

	// Override abstract method to provide body.
	@Override
	int Salary(int bonus) {
		salary = bonus + salary;
		System.out.println("Nurse Bonus:"+bonus);
		System.out.println("Nurse Salary with bonus:");
		return salary;
	}

}

//Abstract class to Define the abstract method.
abstract class Addon {

	// Abstract Method void salary.
	abstract void Salary();

	// Abstract method salary with integer as a parameter.
	abstract int Salary(int bonus);
}

public class Hospital {
	public static void main(String[] args) {
		// Creating the object of class Doc.
		Doc ob = new Doc();
		// Calling the abstract void method.
		ob.Salary();
		// Calling the Abstract method salary with integer as a parameter.
		System.out.println(ob.Salary(100000));

		// Creating the object of class Nurse.
		Nurse o = new Nurse();
		// Calling the abstract void method.
		o.Salary();
		// Calling the Abstract method salary with integer as a parameter.
		System.out.println(o.Salary(10000));
	}
}
