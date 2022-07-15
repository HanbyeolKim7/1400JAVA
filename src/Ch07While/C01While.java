package Ch07While;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {
		
		//기본
		//탈출용 변수 지정
		//탈출용 조건식
		//조건식이 false가 되도록 하는 연산식
		
		//int i=1; //탈출용 변수
		//while(i<=10) //탈출용 조건식
		//{
		//	System.out.println("Hello World!");
		//	i++; //조건식이 거짓이 되기 위한 연산식
		//}
		
		//02 1부터 10까지 합 구하기
		
		//int i=1;
		//int sum=0;	//누적합 저장용
		//while(i<=10)
		//{
		//	System.out.println("i="+i);
		//	sum=sum+i;	//증가되는 i값을 기존의sum과 합하여 누적
		//	i++;
		//}
		//System.out.println("while벗어남 i="=i);
		//System.out.println("1부터 10까지의 합 : " + sum);
		
		
		//문제
		//정수값 하나를 입력받아 1부터 그 수까지의 합을 구합니다
		
		//Scanner sc= new Scanner(System.in);
		//int n= sc.nextInt();
		//int i=1;
		//int sum=0;
		//while(i<n)
		//{
		//	sum=sum+i;
		//	i++;
		//}
		//System.out.printf("1부터 %d까지의 합 : %d\n", n,sum);
		
		//문제
		//정수갑 두개를 입력받아 n부터m까지의 합을 구합니다
		
		//Scanner sc = new Scanner(System.in);
		//(n<m)
		//int n=sc.nextInt();
		//int m=sc.nextInt();
		
		//swap
		
		
		//int i=n;
		//int sum=0;
		
		//while(i<=m)
		//{
		//	sum=sum+i;
		//	i++;
		//}
		//System.out.printf("%d 부터 %d 까지의 합 : %d ",n,m,sum);
		
		//2단 구구단
		
		//int i=1;
		//while(i<=9)
		//{
		//	System.out.printf("%d X %d = %d\n", 2,i,2*i);
		//	i++;
		//}
		
		//2단 역순
	    //int i=9;
		//while(i>=1)
	    //{
		//	System.out.printf("%d X %d = %d\n", 2,i,2*i);
		//	i--;
	    //}	
		
		//N단 역순
		//Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		
		//int i=9;
		
		//while(i>=1)
		//{
		//	System.out.printf("%d X %d = %d\n", n,i,n*i);
		//	i--;
		//}
			
		
		//문제
		//1부터 n까지 수 중에 3의 배수의 합만 구하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.println("N을 입력하시오 : ");
		int n = sc.nextInt();
		int sum=0;
		int i=1;
		
		while(i<=n)
		{
			if(i%3==0)
			{
				sum=sum+i;
			}
			i++;
		}
		System.out.println("합 :"+sum);
	}
 
}
