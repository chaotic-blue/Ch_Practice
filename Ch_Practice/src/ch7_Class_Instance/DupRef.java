//p164 예제. 두 개의 참조변수 함께 참조
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
		System.out.println("잔액 : " + balance);
		return balance;
	}
}


class DupRef {
	public static void main(String[] args) {
		BankAccount1 ref1 = new BankAccount1(); //참조변수 ref1에 BankAccount1 인스턴스 하나 생성 뒤 ref1에 주소값 정의
		BankAccount1 ref2 = ref1; //ref1이 참조하는 대상을 ref2도 주소값 참조, 같은 인스턴스(객체) 사용한다는 말
		
		ref1.deposit(3000);
		ref2.deposit(2000); //여기까지 ref1,ref2 둘다 하나의 인스턴스를 사용하므로 입금 5000
		ref1.withdraw(400);
		ref2.withdraw(300); //출금 700
		ref1.checkMyBalance();
		ref2.checkMyBalance();
		
	}
}
