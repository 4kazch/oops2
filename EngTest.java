class Employee{
	public void display(){
		System.out.println("Name of the class is Employee");
	}
	public void calcSalary(){
		System.out.println("Salary of an employee is 10000");
	}
}
class Engineer extends Employee{
	public Engineer(){
		super.display();
		super.calcSalary();
	}
	public void display(){
		System.out.println("Name of the class is Engineer");
	}
	public void calcSalary(){
		System.out.println("Salary of an employee is 20000");
	}
}
public class EngTest{
	public static void main(String[] args){ 
		Engineer obj=new Engineer();
		obj.display();
		obj.calcSalary();
	}
}
