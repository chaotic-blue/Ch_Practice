//p169 예제. 계좌번호, 주민번호 String 사용하여 해보기
package ch7_Class_Instance;

class BankAccount2 {
	String accNumber;
	String ssNumber;
	int balance = 0;
	
	public void initAccount(String acc, String ss, int bal) {
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

public class BankAccountUniID {
	public static void main(String[] args) {
		BankAccount2 yoon = new BankAccount2();
		yoon.initAccount("12-34-89", "9909990-9090990", 10000); //참조변수 yoon 계좌 개설
		BankAccount2 park = new BankAccount2();
		park.initAccount("33-55-09", "770088-5959007", 10000);
		
		yoon.deposit(5000);
		park.deposit(3000);
		yoon.withdraw(2000);
		park.withdraw(2000);
		yoon.checkMyBalance();
		park.checkMyBalance();
		
	}

}
