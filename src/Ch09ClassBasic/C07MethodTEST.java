package Ch09ClassBasic;

public class C07MethodTEST {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		int r1=cal.sum(10,20);
		System.out.println("r1 : " + r1);
		int r2=cal.sub(50,30);	//뺄셈 x-y
		System.out.println("r2 : " + r2);
		cal.mul(5,6);	//곱셈->곱셈결과가 함수 내의 print호출로 출력
		cal.div(10,2);	//나눗셈->나눗셈결과가 함수 내의 print호출로 출력

	}

}
