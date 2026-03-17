package sec04.test;

import java.util.Scanner;

public class SubstringTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		
		System.out.println("1. 이름: ");
		String name = scanner.nextLine();

		System.out.println("2. 주민번호 앞 6자리: ");
		String ssn = scanner.nextLine();
		
		System.out.println("3. 전화번호: ");
		String tel = scanner.nextLine();
		
		System.out.println();
		
		System.out.println("[입력된 내용]");
		System.out.println("1. 이름: " + name);
		
		String ssnstringtest = ssn.substring(2,6);
		System.out.println("2. 주민번호 앞 6자리: " + ssnstringtest);
		
		// 출력 부분 수정 예시
		String formattedTel = tel.substring(0, 3) + "-" + tel.substring(3, 7) 
		+ "-" + tel.substring(7);
		System.out.println("3. 전화번호: " + formattedTel);
		
	}

}
