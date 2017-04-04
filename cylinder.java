package test;

public class cylinder {
	
 public static double getVolume(Circle cir, double height){
	 return cir.getArea()*height;
 }
 
	public static void main(String[] args) {
		Circle cir=new Circle(2.8);
		double height=5.6;
		System.out.println("반지름이 2.8, 높이가 5.6인 원통의 부피 : "+getVolume(cir,height));
	}

}
