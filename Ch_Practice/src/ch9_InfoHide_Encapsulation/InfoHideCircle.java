//p198 예제. 정보은닉 private 사용문
package ch9_InfoHide_Encapsulation;

class Circle {
	private double rad = 0; //인스턴스 변수 rad의 직접적인 접근을 막기위해 클래스 내에서만 변경 할수 있도록 private정의
	final double PI = 3.14;
	
	public Circle(double r) {
		setRad(r);
	}
	
	public void setRad(double r) {
		if(r<0) {
			rad = 0;
			return;
		}
		rad = r;
	}
	
	public double getRad() {
		return rad;
	}
	
	public double getArea() {
		return (rad * rad) * PI;
	}
}

class InfoHideCircle {
	public static void main(String[] args) {
		Circle c= new Circle(1.5);
		System.out.println("반지름: " + + c.getRad());
		System.out.println("넓 이: " + c.getArea() + "\n");
		
		
		c.setRad(3.4);
		System.out.println("반지름: " + c.getRad());
		System.out.println("넓 이: " + c.getArea());
	}
}
