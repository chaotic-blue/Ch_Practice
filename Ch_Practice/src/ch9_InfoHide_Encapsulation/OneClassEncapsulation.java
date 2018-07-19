//p214 ������. ���԰���� ĸ��ȭ �ϼ��ϱ�
package ch9_InfoHide_Encapsulation;

class SinusCap {
	void sniTake() {
		System.out.println("�๰�� ��~ ����ϴ�.");
	}
	void sneTake() {
		System.out.println("��ä�Ⱑ �ܽ��ϴ�.");
	}
	void snuTake() {
		System.out.println("�ڰ� �� �ո��ϴ�.");
	}
	void take() {
		sniTake();
		sneTake();
		snuTake();
	}
}


class ColdPatient1 {
	void takeSinus(SinusCap cap) { //�ν��Ͻ� �������� cap���� ���� ��� ���
		cap.take();
	}
}


public class OneClassEncapsulation {
	public static void main(String[] args) {
		ColdPatient1 suf = new ColdPatient1(); //�ν��ͽ� ���� �� �������� suf ����
		suf.takeSinus(new SinusCap());
	}
}
