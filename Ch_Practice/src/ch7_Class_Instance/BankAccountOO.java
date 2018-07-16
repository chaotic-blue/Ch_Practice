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
	
		BankAccount yoon = new BankAccount();
		BankAccount park = new BankAccount();
		
		yoon.deposit(5000);
		park.deposit(3000);
		
		yoon.withdraw(2000);
		park.withdraw(2000);
		
		yoon.checkMybalance();
		park.checkMybalance();
	}
}
