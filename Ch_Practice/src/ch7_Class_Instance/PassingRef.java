//p165 ���� . ���������� �����Ͽ� �޼ҵ� ȣ��
package ch7_Class_Instance;

//pakage BankAccount Ŭ���� ���� �صּ� �ۼ� ����

public class PassingRef {
	public static void main(String[] args) {
		
		BankAccount ref = new BankAccount();
		ref.deposit(3000);
		ref.withdraw(300);
		check(ref); //�������� ref�� �޼ҵ� check�� �����Ͽ� ����
	}
	
	public static void check(BankAccount acc) {
		acc.checkMybalance();
		//�޼ҵ� check�� �������� ref�� ���޵Ǿ� acc���������� �ּҰ����� �޾Ƽ�, BankAccountŬ���� �ν��Ͻ��� ����üũ �޼ҵ带 ���.
	}
}
