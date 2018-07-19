package ch9_InfoHide_Encapsulation;

class SinivelCap1 {
	void take() {
		System.out.println("�๰�� ��~ ����ϴ�.");
	}
}

class SneezeCap1 {
	void take() {
		System.out.println("��ä�Ⱑ �ܽ��ϴ�.");
	}
}

class SnuffleCap1 {
	void take() {
		System.out.println("�ڰ� �� �ո��ϴ�.");
	}
}

class SinusCap1 {
	SinivelCap1 siCap = new SinivelCap1();
	SneezeCap1 szCap = new SneezeCap1();
	SnuffleCap1 sfCap = new SnuffleCap1();
	
	void take() {
		siCap.take(); szCap.take(); sfCap.take();
	}
}


class ColdPatient2 {
	void takeSinus1(SinusCap1 cpa) {
		cpa.take();
	}
}


public class CompEncapsulation {
	public static void main(String[] args) {
		ColdPatient2 suf = new ColdPatient2(); // ��ü �ν��Ͻ� ���� �� �������� suf����
		suf.takeSinus1(new SinusCap1());
	}
}
