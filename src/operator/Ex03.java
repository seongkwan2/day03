package operator;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		if(num > 10) {
			System.out.println("1.종속문장 실행!!!");
			System.out.println("2.종속문장 실행!!!");
			System.out.println("3.종속문장 실행!!!");
		}
		System.out.println("다음 문장들 실행...");
		
		System.out.println("수 입력");
		num = input.nextInt();
		String msg = null;
		if(num % 2 == 0) {
			//System.out.println("입력 값은 짝수 : "+num);
			msg = "입력 값은 짝수 : ";
		}
		if(num % 2 != 0) {//num%2 = 1
			//System.out.println("입력 값은 홀수 : "+num);
			msg = "입력 값은 홀수 : ";
		}
		System.out.println(msg + num);
		System.out.println("다음 문장들 실행~");
		
		//수를 입력받아 입력받은 값을 절대값으로만 출력하세요
		// 절대값 |num| : 결과적으로 양의값 부호가 없는값
		// -10 => 10 , 10 => 10
		
		int number;
		System.out.println("(절대값)수 입력: ");
		number = input.nextInt();
		if(number!=0) {
			number = -number;
		}
		System.out.println("num의 절대값 : "+ number);
		
		
		
		
	}
}
