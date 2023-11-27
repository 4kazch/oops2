abstract class Shape{
	abstract void numberOfSides();
}
class Rectangle extends Shape{
	void numberOfSides(){
		System.out.println("Rectangle has 4 sides");
	}
}
class Triangle extends Shape{
	void numberOfSides(){
		System.out.println("Triangle has 3 sides");
	}
}
class Hexagon extends Shape{
	void numberOfSides(){
		System.out.println("Hexagon has 6 sides");
	}
}
public class ShapeTest{
	public static void main(String[] args){
		Shape obj1,obj2,obj3;
		obj1=new Rectangle();
		obj1.numberOfSides();
		obj2=new Triangle();
		obj2.numberOfSides();
		obj3=new Hexagon();
		obj3.numberOfSides();
	}
}
