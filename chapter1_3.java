package week2_pre_20237143;

import java.util.Scanner;

public class chapter1_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("8자리 생일을 입력하세요 (YYYYMMDD): ");
		int birthDate = scanner.nextInt();
		
		int year = birthDate / 10000;
		int month = (birthDate / 100) % 100;
		int day = birthDate % 100;
		
		System.out.println(year + "년" + month + "월" + day + "일");
		
		scanner.close();
	}
}
