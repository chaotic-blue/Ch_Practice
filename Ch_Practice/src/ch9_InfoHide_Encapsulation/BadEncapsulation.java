//p211 ������. ĸ��ȭ�� �̷����� ���� ���

package ch9_InfoHide_Encapsulation;

class SinivelCap {
	void take() {
		System.out.println("�๰�� ��~ ���ϴ�.");
	}
}

class SneezeCap {
	void take() {
		System.out.println("����Ⱑ �ܽ��ϴ�.");
	}

}

class SnuffleCap {
	void take() {
		System.out.println("�ڰ� �� �ո��ϴ�.");
	}
}

class ColdPatient {
	
	void takeSinivelCap(SinivelCap cap) { //�ν��Ͻ� ���� �� �������� cap���� ���� ��� ���
		cap.take();
	}
	void takeSneezeCap(SneezeCap cap) {
		cap.take();
	}
	void takeSnuffleCap(SnuffleCap cap) {
		cap.take();
	}
	
	
}


public class BadEncapsulation {
	public static void main(String[] args) {
		ColdPatient suf = new ColdPatient(); //suf �ν��Ͻ� ����
		
		suf.takeSinivelCap(new SinivelCap()); //�๰ ó�� �� ���� , �ν��Ͻ� ����
		
		suf.takeSneezeCap(new SneezeCap()); //��ä�� ó�� �� ����
		
		suf.takeSnuffleCap(new SnuffleCap()); //�ڸ��� ó�� �� ����
	}
}
