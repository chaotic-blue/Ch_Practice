//p162 ���� ����s
package ch7_Class_Instance;

class BankAccount {
	int balance = 0; //Ŭ���� ���� ����� �ν��Ͻ�(��ü) ����, ���������� �ƴϴ�!
	
	public int deposit(int amount) { //Ŭ���� ���� ���ǵ� �޼ҵ�
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMybalance() {
		System.out.println("�ܾ� : " + balance);
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
