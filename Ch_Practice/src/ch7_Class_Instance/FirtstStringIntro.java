package ch7_Class_Instance;

public class FirtstStringIntro {
	public static void main(String[] args) {
		String str1 = "Happy"; //happy문자열 String클래스 타입의 str1 참조변수에 정의
		String str2 = "Birthday";
		System.out.println(str1 + " " + str2);
		
		printString(str1); // 참조변수 str1 printString 메소드에 전달
		printString(" ");
		printString(str2);
		printString("\n");
		printString("End of program! \n");
	}
	
	public static void printString(String str) {
		System.out.println(str);
	}
}
