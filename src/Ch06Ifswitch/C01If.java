package Ch06Ifswitch;

import java.util.Scanner;

public class C01If {

	public static void main(String[] args) {
		//단순 If
		//if(조건식)
		//{
		//    //참일 경우 실행될 코드
		//}
		//else
		//{
		//    //거짓일 경우 실행될 코드
		//}
				
		//int age=7;
		
		//if(age>=8)
		//{
		//	System.out.println("취학 아동입니다");
		//}
		//System.out.println("첫번째 IF문 벗어남");
		//if(age<8)
		//{
		//	System.out.println("미취학 아동입니다");
		//}
		//System.out.println("두번재 IF문 벗어남");
		//System.out.println("프로그램을 종료합니다");
		
		//IF-ELSE문
		//if(조건식)
		//{
		//    //참일 경우 실행될 코드
		//}
		//else
		//{
		//    //거짓일 경우 실행될 코드
		//}
		
		//if(age>=8)
		//{
		//	System.out.println("취학 아동입니다");
		//}
		//else
		//{
		//	System.out.println("미취학 아동입니다");
		//}
		//System.out.println("프로그램을 종료합니다");
		
		
		//문제
		//정수 하나를 받아서 짝수면 "짝수입니다"
		//홀수면 "홀수입니다"를 출력하세요
		//Scanner sc = new Scanner(System.in);
		//System.out.print("정수를 입력하세요 : ");
		//int num1 = sc.nextInt();
		//if(num1%2==0)
		//{
		//	System.out.println("짝수입니다");
		//}
		//else
		//{
		//	System.out.println("홀수입니다");
		//}
		
		
		//문제
		//정수 하나를 받아서 3의 배수면 "3의 배수입니다"
		//4의 배수면 "4의 배수 입니다"를 출력하세요
		//Scanner sc = new Scanner(System.in);
		//System.out.print("정수를 입력하세요 : ");
		//int num2 = sc.nextInt();
		//if(num2%3==0)
		//{
		//	System.out.println("3의 배수입니다");
		//}
		//if(num2%4==0)
		//{
		//	System.out.println("4의 배수입니다");
		//}
		
		
		//문제
		//두 정수를 입력받아서 큰수를 출력하세요(IF-ELSE)
		//Scanner sc = new Scanner(System.in);
		//System.out.print("첫번째 정수를 입력하세요 : ");
		//int num3 = sc.nextInt();
		//System.out.print("두번째 정수를 입력하세요 : ");
		//int num4 = sc.nextInt();
		//if(num3>num4)
		//{
		//	System.out.print(num3);
		//}
	    //else
		//{
		//	System.out.print(num4);
		//}
		
		//중첩if문
		//이중 조건
		
		//문제
		//3의 배수이면서 4의 배수라면 출력
		//3의 배수가 아니면서 5의 배수라면 출력
		
		//Scanner sc = new Scanner(System.in);
		
		//int num=sc.nextInt();
		
		//if(num%3==0)
		//{
			//3의 배수인 경우
		//	if(num%4==0)
		//	{
		//		System.out.println("3의 배수이면서 4의 배수");
		//	}
		//}
		//else
		//{
			//3의 배수가 아닌 경웅
		//	if(num%5==0)
		//	{
		//		System.out.println("3의 배수가 아니면서 5의 배수");
		//	}
		//}
		
		//if(num%3==0 && num%4==0)
		//{
		//	System.out.println("3의 배수, 4의 배수");
		//}
		//else
		//{
			
		//}
		
		//if(num%3==0 && num%5==0)
		//{
		//	System.out.println("3의 배수가 아니면서 5의 배수");
		//}
		
		
		
		
		
		//
		
		
		//예제
		//국영수 각각의 점수가 40점 이상이 되어야 하고 
		//총평균이 60점이상이 되면 "합격" 출력
		//그게 아니면 "불합격" 출력
		
		//국어가 40점 이하냐? -> 불합격
		//수학이 40점 이하냐? -> 불합격
		//영어가 40점 이하냐? -> 불합격
		//평균이 60점 미만이냐? -> 불합격
		//아니라면 -> 합격
		
		//Scanner sc = new Scanner(System.in);
		//System.out.print("국어 점수 : ");
		//int kor = sc.nextInt();
		//System.out.print("영어 점수 : ");
		//int eng = sc.nextInt();
		//System.out.print("수학 점수 : ");
		//int mat = sc.nextInt();
		//double avg = (double)(kor+eng+mat)/3;
		//if(kor<40) {
		//	System.out.println("불합격!");
		//}
		//else if(eng<40) {
		//	System.out.println("불합격!");
		//}
		//else if(mat<40) {
		//	System.out.println("불합격!");
		//}
		//else if(avg<60.0) {
		//	System.out.println("불합격!");
		//}
		//else {
		//	System.out.println("합격!");
		//}
		
		
	    Scanner sc = new Scanner(System.in);
	    int avg=sc.nextInt();
	    
	    if(avg>=90)
	    {
	    	System.out.println("A");
	    }
	    else if(avg>=80)
	    {
	    	System.out.println("B");
	    }
	    else if(avg>=70)
		{
			System.out.println("c");
		}
		else if(avg>=60)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("F");
		}
		
		
		//문제
		//세 정수를 입력받아서 큰수를 출력하세요(단순IF문으로만)
		//Scanner sc = new Scanner(System.in);
		
		//System.out.print("세 정수 입력 : ");
		//int n1=sc.nextInt();
		//int n2=sc.nextInt();
		//int n3=sc.nextInt();
		
		//if(n1>=n2 && n1>=n3)
		//{
		//	System.out.println("큰수 : " + n1);
		//}
		//else if(n2>=n1 && n2>=n3)
		//{ 
		//	System.out.println("큰수 : " + n2);
		//}
		//else if(n3>=n1 && n3>=n1)
		//{
		//	System.out.println("큰수 : " + n3);
		//}
		

	}

}
