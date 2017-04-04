package test;

public class cylinder2 {

	Circle ci;
	private double height;
	
	public cylinder2(Circle ci, double height){
		this.ci=ci;
		this.height=height;
		}
	public static double getVolume(double CircleArea,double height){
		return CircleArea*height;
	}
	
	
	public static void main(String[] args){
		cylinder2 cd=new cylinder2(new Circle(2.8),5.6);
		System.out.println("원통의 부피는"+cd.getVolume(cd.ci.getArea(),cd.height));
	}
}
