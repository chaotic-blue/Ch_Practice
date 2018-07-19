//p214 참고예제. 포함관계로 캡슐화 완성하기
package ch9_InfoHide_Encapsulation;

class SinusCap {
	void sniTake() {
		System.out.println("콧물이 싹~ 멈춥니다.");
	}
	void sneTake() {
		System.out.println("재채기가 멎습니다.");
	}
	void snuTake() {
		System.out.println("코가 뻥 뚫립니다.");
	}
	void take() {
		sniTake();
		sneTake();
		snuTake();
	}
}


class ColdPatient1 {
	void takeSinus(SinusCap cap) { //인스턴스 참조변수 cap으로 복용 결과 출력
		cap.take();
	}
}


public class OneClassEncapsulation {
	public static void main(String[] args) {
		ColdPatient1 suf = new ColdPatient1(); //인스터스 생성 뒤 참조변수 suf 정의
		suf.takeSinus(new SinusCap());
	}
}
