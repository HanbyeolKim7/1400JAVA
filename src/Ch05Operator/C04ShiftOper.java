package Ch05Operator;

public class C04ShiftOper {

	public static void main(String[] args) {
		
		
		//shift연산자 
		//<<2 왼쪽으로 두칸이동 (*2^n)
		//>>2 오른쪽으로 두칸이동 (/2^n)
		int num1=15;			//00000000 00000000 00000000 00001111
		int num2=20;			//00000000 00000000 00000000 00010100
		int num3 = num1<<2;		//00000000 00000000 00000000 00000100
		int num4 = num2>>2;		//00000000 00000000 00000000 00011111
	
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		


	}

}
