//p172 예제. 계좌번호, 주민번호 String 사용하여 해보기 (생성자 메소드로 초기화)
package ch7_Class_Instance;

class BankAccount3 {
	String accNumber;
	String ssNumber;
	int balance = 0;
	
	public BankAccount3(String acc, String ss, int bal) { 
		//생성자 메소드로 초기화 정의, 생성자 이름은 클래스 이름과 같고, 생성자는 값 반환 하지않고 반환형도 표시하지 않는다.
		accNumber = acc;
		ssNumber = ss;
		balance = bal; //계좌 개설 시 예금액으로 초기화
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	public int checkMyBalance() {
		System.out.println("계좌번호: " + accNumber);
		System.out.println("주민번호: " + ssNumber);
		System.out.println("잔  액: " + balance + '\n');
		return balance;
	}
}

public class BankAccountConstructor {
	public static void main(String[] args) {
		BankAccount3 yoon = new BankAccount3("12-34-89", "9909990-9090990", 10000);
		//생성자 메소드를 사용하여서 yoon.init();같이 메소드를 굳이 한번더 호출하여 액세스를 시킬필요가 없어진다.
		BankAccount3 park = new BankAccount3("33-55-09", "770088-5959007", 10000);
	
		yoon.deposit(5000);
		park.deposit(3000);
		yoon.withdraw(2000);
		park.withdraw(2000);
		yoon.checkMyBalance();
		park.checkMyBalance();
		
	}

}
