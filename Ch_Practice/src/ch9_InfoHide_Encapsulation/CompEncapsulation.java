package ch9_InfoHide_Encapsulation;

class SinivelCap1 {
	void take() {
		System.out.println("콧물이 싹~ 멈춥니다.");
	}
}

class SneezeCap1 {
	void take() {
		System.out.println("재채기가 멎습니다.");
	}
}

class SnuffleCap1 {
	void take() {
		System.out.println("코가 뻥 뚫립니다.");
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
		ColdPatient2 suf = new ColdPatient2(); // 객체 인스턴스 생성 및 참조변수 suf정의
		suf.takeSinus1(new SinusCap1());
	}
}
