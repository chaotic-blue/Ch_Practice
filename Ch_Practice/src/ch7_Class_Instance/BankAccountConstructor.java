//p172 ����. ���¹�ȣ, �ֹι�ȣ String ����Ͽ� �غ��� (������ �޼ҵ�� �ʱ�ȭ)
package ch7_Class_Instance;

class BankAccount3 {
	String accNumber;
	String ssNumber;
	int balance = 0;
	
	public BankAccount3(String acc, String ss, int bal) { 
		//������ �޼ҵ�� �ʱ�ȭ ����, ������ �̸��� Ŭ���� �̸��� ����, �����ڴ� �� ��ȯ �����ʰ� ��ȯ���� ǥ������ �ʴ´�.
		accNumber = acc;
		ssNumber = ss;
		balance = bal; //���� ���� �� ���ݾ����� �ʱ�ȭ
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
		System.out.println("���¹�ȣ: " + accNumber);
		System.out.println("�ֹι�ȣ: " + ssNumber);
		System.out.println("��  ��: " + balance + '\n');
		return balance;
	}
}

public class BankAccountConstructor {
	public static void main(String[] args) {
		BankAccount3 yoon = new BankAccount3("12-34-89", "9909990-9090990", 10000);
		//������ �޼ҵ带 ����Ͽ��� yoon.init();���� �޼ҵ带 ���� �ѹ��� ȣ���Ͽ� �׼����� ��ų�ʿ䰡 ��������.
		BankAccount3 park = new BankAccount3("33-55-09", "770088-5959007", 10000);
	
		yoon.deposit(5000);
		park.deposit(3000);
		yoon.withdraw(2000);
		park.withdraw(2000);
		yoon.checkMyBalance();
		park.checkMyBalance();
		
	}

}
