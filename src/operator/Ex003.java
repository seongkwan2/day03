package operator;

import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {

		//사용자에게 연도를 입력받아 윤년이면 1, 
		//아니면 0을 출력하는 프로그램을 작성하시오.

		/*
 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
 예) 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 
     1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 
     하지만, 2000년은 400의 배수이기 때문에 윤년이다.
		 */

		Scanner input = new Scanner(System.in);

		int a;
		int b = 0;
		System.out.print("연도를 입력하세요 : ");
		a = input.nextInt();
		if(a % 4 == 0 && a % 100 != 0) {
			b = 1;
		}
		if(a % 400 == 0) {
			b = 1;
		}
		if(b == 0) {
			System.out.println("윤년이 아닙니다.");
		}
		if(b == 1) {
			System.out.println("윤년입니다.");
		}
		
	}
	/*2번문제
	 * //사용자로부터 세 개의 정수를 입력받아, 
			//그 수들의 최대값과 최소값, 합계와 평균을 구해보자.
			
			int su1, su2, su3, sum;
			double avr;
			Scanner input = new Scanner(System.in);
			System.out.println("세 개의 정수 입력: ");
			
			su1 = input.nextInt();
			su2 = input.nextInt();
			su3 = input.nextInt();
			
			sum = su1 + su2 + su3;
			avr = (su1 + su2 + su3)/3;
			
			if(su1 > su2 && su1 > su3) {
				System.out.println("최대값 : "+su1);
			}
			if(su2 > su1 && su2 > su3) {
				System.out.println("최대값 : "+su2);
			}
			if(su3 > su1 && su3 > su2) {
				System.out.println("최대값 : "+su3);
			}
			if(su1 < su2 && su1 < su3) {
				System.out.println("최소값 : "+su1);
			}
			if(su2 < su1 && su2 < su1) {
				System.out.println("최소값 : "+su2);
			}
			if(su3 < su1 && su3 < su2) {
				System.out.println("최소값 : "+su3);
			}
			System.out.println(su1+","+su2+","+su3+"의 합: "+sum);
			System.out.println(su1+","+su2+","+su3+"의 평균: "+avr);
			
		}*/
	
	/* 3번문제
	 * //if문만 사용해서 (else문 사용금지)
	//100점이면 S ,90점이상이면 A, 80점이상이면 B, 70점 이상이면 C
	//70점 미만이면 F가 나오도록 코딩하시오
		
		int score;
		Scanner input = new Scanner(System.in);
		System.out.println("점수입력 : ");
		score = input.nextInt();
		if(score==100) {
			System.out.println("S");
		}
		if(score>=90 && score<100) {
			System.out.println("A");
		}
		if(score>=80 && score<90) {
			System.out.println("B");
		}
		if(score>=70 && score<80) {
			System.out.println("C");
		}
		if(score<70) {
			System.out.println("F");
		}
		
		
	}
	 */
	
	
	
	
	
}

