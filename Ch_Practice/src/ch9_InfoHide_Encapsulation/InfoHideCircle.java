//p198 ����. �������� private ��빮
package ch9_InfoHide_Encapsulation;

class Circle {
	private double rad = 0; //�ν��Ͻ� ���� rad�� �������� ������ �������� Ŭ���� �������� ���� �Ҽ� �ֵ��� private����
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
		System.out.println("������: " + + c.getRad());
		System.out.println("�� ��: " + c.getArea() + "\n");
		
		
		c.setRad(3.4);
		System.out.println("������: " + c.getRad());
		System.out.println("�� ��: " + c.getArea());
	}
}