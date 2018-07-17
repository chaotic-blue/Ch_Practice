//p165 예제 . 참조변수를 전달하여 메소드 호출
package ch7_Class_Instance;

//pakage BankAccount 클래스 정의 해둬서 작성 안함

public class PassingRef {
	public static void main(String[] args) {
		
		BankAccount ref = new BankAccount();
		ref.deposit(3000);
		ref.withdraw(300);
		check(ref); //참조변수 ref를 메소드 check에 전달하여 실행
	}
	
	public static void check(BankAccount acc) {
		acc.checkMybalance();
		//메소드 check에 참조변수 ref가 전달되어 acc참조변수로 주소값으로 받아서, BankAccount클래스 인스턴스의 계좌체크 메소드를 사용.
	}
}
