package Ch02Su;

public class C07리터럴상수 {

	public static void main(String[] args) {
		
		//상수 : 고정된 수
		//상수 종류
		//리터럴 상수 : 이름부여 X  
		//심볼릭 상수 : 이름부여 O
		
		
		//정수 리터럴 기본자료형 : int
		//실수 리터럴 기본자료형 : double
		
		//리터럴 접미사
		//정수 : l,L(long)
		//실수 : f,F(float)
		
		//예제1
		//byte num1 = 129; //자료형이 다름 우변은 int형
		//long num2 = 123L; 
		//double num3 = 123.456;
		//float num4 = 123.456; //자료형이 다름, 우변은 더블형, 해결 = F접미사
		
		//byte num1 = (byte)129;
		//System.out.println(num1);
		
		//예제2
		
		//int num1 = 4000000000;//40억
		//int num2 = 4000000000L;//40억
		//해결 long num3 = 4000000000L;
	}

}
