package MainPackage;

public class quiz3 {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public quiz3(){
		
	}
	
	public quiz3(double side1, double side2, double side3){
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
	}
	
	public void setside1(double side1){
		this.side1 = side1;
	}
	
	public void setside2(double side2){
		this.side2 = side2;
	}
	
	public void setside3(double side3){
		this.side3 = side3;
	}
	
	public double getside1(){
		return side1;
	}
	
	public double getside2(){
		return side2;
	}
	
	public double getside3(){
		return side3;
	}
	
	public double getPerimeter(){
		double P = side1 + side2 + side3;
		return P;
	}
	
	public double getArea(){
		double H = Math.sqrt(((side1 * side1)-(0.25 * side2 * side2)));
		double A = (side2 * H) / 2;
		return A;
	}
	
	public String toString(){
		return "For this triangle, side1 is " + side1 + ", side2 is " + side2 + ", side3 is " + side3 + ", area is " + getArea() + ", perimater is" + getPerimeter();
	}
}
