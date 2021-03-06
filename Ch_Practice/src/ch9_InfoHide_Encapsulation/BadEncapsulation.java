//p211 참고예제. 캡슐화가 이뤄지지 않은 경우

package ch9_InfoHide_Encapsulation;

class SinivelCap {
	void take() {
		System.out.println("콧물이 싹~ 납니다.");
	}
}

class SneezeCap {
	void take() {
		System.out.println("제재기가 멎습니다.");
	}

}

class SnuffleCap {
	void take() {
		System.out.println("코가 뻥 뚫립니다.");
	}
}

class ColdPatient {
	
	void takeSinivelCap(SinivelCap cap) { //인스턴스 생성 뒤 참조변수 cap으로 복용 결과 출력
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
		ColdPatient suf = new ColdPatient(); //suf 인스턴스 생성
		
		suf.takeSinivelCap(new SinivelCap()); //콧물 처방 약 복용 , 인스턴스 생성
		
		suf.takeSneezeCap(new SneezeCap()); //제채기 처방 약 복용
		
		suf.takeSnuffleCap(new SnuffleCap()); //코막힘 처방 약 복용
	}
}
