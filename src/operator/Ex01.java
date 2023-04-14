package operator;

public class Ex01 {
	public static void main(String[] args) {
		
		
		System.out.println("========비트 연산자========");
		System.out.println(3 & 5);
						//0011 & 0101 = 0001 (and연산)
		System.out.println(3 | 5);
						//0011 | 0101 = 0111 (or연산)
						//			  =    7
		System.out.println("========증감 연산자========");
		/*
		 증감연산자 : 결과적으로 자기자신을 1 증가 또는 감소
		 ++num, num++, --num, num--
		 num = num + 1
		 */
		int a,b,c;
		c = 10;
		a = ++c; //계산된 값이 저장됨
				 //연산자가 앞에 있으면 계산부터, 뒤에있으면 저장부터
		c = 10;
		b = c++; //저장 후에 계산
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		
		int n;
		n = 5;
		n++;
		System.out.println(n);
		
		n = 5;
		++n;
		System.out.println(n);
		
		System.out.println("========논리 연산자========");
		/*
		  논리 연산자 : true 또는 false만 표현
		  ||(or) : 식들 중 하나라도 참이면 참
		  &&(and) : 모든 값이 참 일때만 참
		  			 -하나라도 거짓이면 거짓
		   !(not) : !true => false
		 */
		int number = 10;
		System.out.println(number > 5 && number % 2 == 0);
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("!true : " +!true);
		System.out.println("!true : " +!false);
		
		System.out.println();
		
		System.out.println("========관계 연산자========");
		/*
		 * 관계연산자 : true 또는 false의 결과
		 * a=10, b=20;
		 * a > b : a가 b보다 크냐? => false
		 * >, <, >=, <=, ==, !=
		 */
		double do01=1.1, do02=1.2;
		System.out.println(do01 >= do02);
		System.out.println(do01 <= do02);
		System.out.println(do01 == do02);
		System.out.println(do01 != do02);
		
		
		
		/*
		 복합대입 연산자
		 num = 10;
		 num = num + 10; => num += 10;
		 num = num / 10; => num /= 10;
		 num = num % 10; => num %= 10;
		 */
		System.out.println("========복합대입연산자========");
		int su1, su2;
		su1 = su2 = 5;
		su1 += 1;
		System.out.println(su1);//6
		su1 -= 1;
		System.out.println(su1);//5
		su1 *= su2;
		System.out.println(su1);//25
		su1 /= su2;
		System.out.println(su1);//5
		su1 %= su2;
		System.out.println(su1);//0
		System.out.println("==========================");
		
	/*
	 + , - , * , / , %
	 / : 정수 / 정수 = 정수(몫).
	  	- 10 / 3 = 3, 10 / 3.0 = 3.333 (정수랑 실수랑 계산하면 실수가나옴)
	  	%(mod) : 나머지를 구해준다. 10 % 3 = 1
	  	
	 */
		
		int num1 = 9, num2 = 2;
		System.out.println(num1 / num2);
		System.out.println(num1 / (float)num2);
		System.out.println(num1 % num2);
		
	}
}
