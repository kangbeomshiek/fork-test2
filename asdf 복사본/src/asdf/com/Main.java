package asdf.com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner scanner = new Scanner(System.in); // 스캐너 사용 허락받기
//
//		int num1; // 입력값 지정
//
//		System.out.print("정수를 입력하세요 : "); // 출력문 받기
//		num1 = scanner.nextInt();
//
//		if (num1 % 2 == 0) { // 로직 굴리기
//
//			System.out.println("짝수입니다"); // 참일때 값
//		} else {
//			System.out.println("홀수입니다"); // 아닐때 값
//
//		}

		Scanner scanner = new Scanner(System.in); // scanner사용 허가받기
		int num1; // 변수지정
		int num2; // 변수지정2

		System.out.print("첫번째 정수를 입력하세요 : "); // 출력문
		num1 = scanner.nextInt(); // 입력값 받아오기
		System.out.print("두번째 정수를 입력하세요 : ");
		num2 = scanner.nextInt();

		if (num1 < num2) {
			System.out.println("첫번째 숫자가 더 작습니다"); // 작을때

		} else if (num1 > num2) {
			System.out.println("첫번째 숫자가 더 큽니다"); // 클때

		} else {
			System.out.println("두 수가 같습니다"); // 같을때
		}

	}
}
