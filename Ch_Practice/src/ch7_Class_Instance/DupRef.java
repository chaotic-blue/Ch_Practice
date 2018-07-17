//p164 ����. �� ���� �������� �Բ� ����
package ch7_Class_Instance;

class BankAccount1 {
	int balance = 0;
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	public int checkMyBalance() {
		System.out.println("�ܾ� : " + balance);
		return balance;
	}
}


class DupRef {
	public static void main(String[] args) {
		BankAccount1 ref1 = new BankAccount1(); //�������� ref1�� BankAccount1 �ν��Ͻ� �ϳ� ���� �� ref1�� �ּҰ� ����
		BankAccount1 ref2 = ref1; //ref1�� �����ϴ� ����� ref2�� �ּҰ� ����, ���� �ν��Ͻ�(��ü) ����Ѵٴ� ��
		
		ref1.deposit(3000);
		ref2.deposit(2000); //������� ref1,ref2 �Ѵ� �ϳ��� �ν��Ͻ��� ����ϹǷ� �Ա� 5000
		ref1.withdraw(400);
		ref2.withdraw(300); //��� 700
		ref1.checkMyBalance();
		ref2.checkMyBalance();
		
	}
}
