package ch7_Class_Instance;

public class FirtstStringIntro {
	public static void main(String[] args) {
		String str1 = "Happy"; //happy���ڿ� StringŬ���� Ÿ���� str1 ���������� ����
		String str2 = "Birthday";
		System.out.println(str1 + " " + str2);
		
		printString(str1); // �������� str1 printString �޼ҵ忡 ����
		printString(" ");
		printString(str2);
		printString("\n");
		printString("End of program! \n");
	}
	
	public static void printString(String str) {
		System.out.println(str);
	}
}
