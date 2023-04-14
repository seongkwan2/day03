package operator;

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {

		/*int kor,mat,eng,num;
		
		Scanner input = new Scanner(System.in);
		System.out.println("국어점수 입력: ");
		kor = input.nextInt();
		
		System.out.println("수학점수 입력: ");
		mat = input.nextInt();
		
		System.out.println("영어점수 입력: ");
		eng = input.nextInt();
		
		System.out.println("1.국어점수 2.수학점수 3.영어점수 출력");
		num = input.nextInt();
		if(num == 1) {
			System.out.println("1.국어"+kor);
		}
		if(num == 2) {
			System.out.println("2.영어"+eng);
		}
		if(num == 3) {
			System.out.println("3.수학"+mat);
		}
		if(num == 4) {
			System.out.println("에러");
			*/
		
	/*	2번문제.
	 * 	짱구 친구들이 돌아가면서 학교를 청소합니다. 
		1일에는 짱구가, 2일에는 유리가, 3일에는 철수가, 4일에는 맹구가, 5일에는 훈이가, 6일에는
		다시 짱구로 돌아가는 청소 시스템이라면 사용자가 입력한 날짜에는 누가 청소를 하는지 구하세요.
		 (단, 4월기준으로 30일이 넘어간다면 오류처리하시오.)	*/
		
		
		
		
		int day;
		
		Scanner input = new Scanner(System.in);
		System.out.println("오늘은 4월 며칠입니까? (숫자만 기입)");
		day = input.nextInt();
		
		if(day <= 30 && day %5 == 1) {
			System.out.println(day + "일은 짱구가 청소하는 날입니다.");
		}
		if(day <= 30 && day %5 == 2) {
			System.out.println(day + "일은 유리가 청소하는 날입니다.");
		}
		if(day <= 30 && day %5 == 3) {
			System.out.println(day + "일은 철수가 청소하는 날입니다.");
		}
		if(day <= 30 && day %5 == 4) {
			System.out.println(day + "일은 맹구가 청소하는 날입니다.");
		}
		if(day <= 30 && day %5 == 0) {
			System.out.println(day + "일은 훈이가 청소하는 날입니다.");
		}
		if(day > 30) {
			System.out.println("잘못 입력 하셨습니다. 다시 실행해주세요");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}
	

