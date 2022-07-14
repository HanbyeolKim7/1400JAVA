package Ch05Operator;

import java.util.Scanner;

public class Ch01Basic {

	public static void main(String[] args) {
		//산술 연산자
		//int a=10, b=3,c;
		//System.out.println("a + b = "+(a+b));
		//System.out.println("a - b = "+(a-b));
		//System.out.println("a * b = "+(a*b));
		//System.out.println("a / b = "+(a/b));	// 몫 계산
		//System.out.println("a % b = "+(a%b));	// 나머지 계산 %연산자 중요!
												// 1)짝홀수 2)배수 3)끝자리 4)수 범위 제한
		//System.out.println("-a = "+(-a));		// a=-a랑 혼동 주의!

		
		//복합대입 연산자
		//+= , -= , *= , /= %=
		
		//int a = 10;
		//a+=10;	//a = a+10
		//System.out.println("a : " +a);
		//a-=5;	//a = a-5
		//System.out.println("a : " +a);
		//a*=7;	//a = a*7
		//System.out.println("a : " +a);
		//a/=7;	//a =a/7
		//System.out.println("a : " +a);
		
		
		//비교연산자
		// > >= < <= == !=
		
		//int a=10, b=20;
		//System.out.println("a == b ? " + (a==b));
		//System.out.println("a >= b ? " + (a>=b));
		//System.out.println("a >  b ? " + (a> b));
		//System.out.println("a <= b ? " + (a<=b));
		//System.out.println("a <  b ? " + (a< b));
		//System.out.println("a != b ? " + (a!=b));
		
		
		//논리연산자
		//and 연산자(&&)-그리고		: 둘다 참(true)이면 참(true)반환
		//or 연산자(||) -또는 		: 둘 중 하나라도 참(true)이면 참(true)반환
		//! 부정연산자 : true인 경우 false를 반환, false인 경우 true반환
		
		//System.out.println("true && true ? " + (true&&true));
		//System.out.println("false && true ? " + (false&&true));
		//System.out.println("true && true ? " + (true&&false));
		//System.out.println("false && false ? " + (false&&false));
		
		//int a=10, b=20, c=15;
		//System.out.println("true && true ? " + (a>=b && a>=b));
		//System.out.println("false && true ? " + (b>=c && b>=a));
		//System.out.println("true && false ? " + (true&&false));
		//System.out.println("false && false ? " + (false&&false));
		
		//System.out.println("true||true ? " + (true||true));
		//System.out.println("false||true ? " + (false||true));
		//System.out.println("true||false ? " + (true||false));
		//System.out.println("false||false ? " + (false||false));
		
		//boolean flag = true;
		//System.out.println(!flag);
		
		
		//증감연산자(++,--)
		//전치연산자 : ++a, --a		//1증가, 1감소		변수안의 값을 먼저 증가(or감소) 후 다른 연산처리
		//후치연산자 : a++, a-- 	//1증가, 1감소		다른연산처리 먼저 한다음 1증가(or감소)
		
		//int a=10, b=20, c, d;
		//c=--a + b--;
		//d=a-- + --b;
		//System.out.printf("%d %d %d %d\n", a,b,c,d);
		
		
		//삼항연산자(If문으로 대체가능, 단순구조의 반복문)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수입력 : ");
//		int score = sc.nextInt();
//		char grade = (score>90)? 'A':'B';
//		System.out.println("grade : " + grade);
		
		//문제
		//두 수를 입력받아 큰수를 출력하세요
	    Scanner sc = new Scanner(System.in);
	    System.out.print("1 정수 : ");
	    int n1 = sc.nextInt();
		System.out.print("2 정수 : ");
		int n2 = sc.nextInt();
		
		int result=(n1>n2)?n1:n2;
		System.out.println("큰수 : " + result);
		
		
		
		
	}

}
