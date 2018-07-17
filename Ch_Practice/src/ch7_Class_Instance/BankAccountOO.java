//p162 예제 참조s
package ch7_Class_Instance;

class BankAccount {
	int balance = 0; //클래스 내에 선언된 인스턴스(객체) 변수, 지역변수는 아니다!
	
	public int deposit(int amount) { //클래스 내에 정의된 메소드
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMybalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}
}

public class BankAccountOO {
	public static void main(String[] agrs) {
	
		/*
		BankAccount yoon; //yoon이라는 BankAccount의 주소값을 저장하는 참조변수 정의
		BankAccount park;
		yoon = new BankAccount(); //참조변수 yoon에 BankAccount클래스의 인스턴스(객체)를 생성하여 주소값을 정의해준다.
		park = new BankAccount();
		*/
		
		BankAccount yoon = new BankAccount();
		BankAccount park = new BankAccount();
		
		yoon.deposit(5000); //BankAccount인스턴스의 주소값이 정의된 yoon으로 인스턴스에 접근하여 deposit메소드 사용.
		park.deposit(3000);
		
		yoon.withdraw(2000);
		park.withdraw(2000);
		
		yoon.checkMybalance();
		park.checkMybalance();
	}
}
