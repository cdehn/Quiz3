import java.lang.Math;

public class Triangle extends GeometricObject {

	private double side1;
	private double side2;
	private double side3;
	private double s;
	
//no-arg constructor that creates a default triangle
public Triangle() {
	side1 = 1;
	side2 = 1;
	side3 = 1;
}

//constructor that creates a triangle with specified sides
public Triangle(double side1, double side2, double side3){
	this.side1 = side1;
	this.side2 = side2;
	this.side3 = side3;
}

//accessors
public double getSide1(){
	return this.side1;
}

public double getSide2(){
	return this.side2;
}

public double getSide3(){
	return this.side3;
}


//3 methods
public double getArea(){
	s = ((side1 + side2 + side3) / (2));
	return (Math.sqrt(s * ((s-side1) * (s-side2) * (s-side3))));
}

public double getPerimeter(){
	return (side1 + side2 + side3);
}

public String toString(){	
	return ("Perimeter is " + getPerimeter() + " area is " + getArea());
}


}
