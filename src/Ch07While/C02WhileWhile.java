package Ch07While;

public class C02WhileWhile {

	public static void main(String[] args) {
		
		//전체 구구단출력(2-9단)
		//int i;
		//int dan=2;
		//while(dan<=9)
		//{
		//	i=1;
		//	while(i<=9)
		//	{
		//		System.out.printf("%d X %d = %d\n", dan,i,dan*i);
		//		i++;
		//	}
		//	System.out.println();
		//	dan++;
		//}
		
		
		//구구단 역순
		//int i;
		//int dan = 2;
		//while(dan<=9)
		//{
		//	i=9;
		//	while(i>=1)
		//	{
		//		System.out.printf("%d X %d = %d\n", dan,i,dan*i);
		//		i--;
		//	}
		//	System.out.println();
		//	dan++;
		//}
		
		//구단 부터 역순
		//int i;
		//int dan=9;
		//while(dan>=2)
		//{
		//	i=9;
		//	while(i>=1)
		//	{
		//		System.out.printf("%d X %d = %d\n", dan,i,dan*i);
		//		i--;
		//	}
		//	System.out.println();
		//	dan--;
		//}
		
		//int i=0;
		//int j=0;
		
		//while(i<4)
		//{
		//	j=0;
		//	while(j<5)
		//	{
		//		System.out.print("*");
		//		j++;
		//	}
		//	System.out.println();
		//	i++;
		//}
		
		
		
		
		//*
		//**
		//***
		//****
//	i(행)	j(별)
//	i=0		j=0
//  i++		j++
//  i<4		j<=i
		
		//int i=0;
		//int j=0;
		//while(i<4)
		//{
		//	j=0;
		//	while(j<=i)
		//	{
		//		System.out.print("*");
		//		j++;
		//	}
		//	System.out.println();
		//	i++;
		
		
		//****
		//***
		//**
		//*
		
		
		
		
		//   *
		//  ***
		// *****
		//*******
		
		//int i=0;//행증가
		//int j=0;//공백
		//int k=0;//별
		
		//while(i<=3)
		//{
		//	//공백찍기
		//	j=0;
		//	while(j<=2-i)
		//	{
		//		System.out.print(" ");
		//		j++;
		//	}
		//	//별찍기
		//	k=0;
		//	while(k<=2*i)
		//	{
		//		System.out.print("*");
		//		k++;
		//	}
		//	
		//	System.out.println();
		//	i++;
		
		//*******
		// *****
		//  ***
		//   *
		
		//i(행)	j(공백)	k(별)
		//0		-		0-6
		//1		0-0		0-4
		//2		0-1		0-2
		//3		0-2		0-0
		
		//공백 = j<=i-1
		//별 = k <=2*(3-i)
		
		//int i=0;
		//int j=0;
		//int k=0;
		//
		//while(i<4)
		//{
		//	//공백
		//	j=0;
		//	while(j<=i-1)
		//	{
		//		System.out.print(" ");
		//		j++;
		//	}
		//	//별
		//	k=0;
		//	while(k<=2*(3-i))
		//	{
		//		System.out.print("*");
		//		k++;
		//	}
		//	System.out.println();
		//	i++;
		//}
		
		
		//문제
		//다이아몬드모양출력
		//모래시계모양 출력
		//높이 입력받아 출력하는 직각 삼각형
		//높이 입력받아 출력하는 직각 역삼각형
		//높이 입력받아 출력하는 정삼각형
		//높이 입력받아 출력하는 역삼각형
		//높이 입력받아 출력하는 다이아몬드
		//높이 입력받아 출력하는 모래시계
		
		
		
		
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *
		
		//i(행)	j(공백)	k(별)
		//0		0-2		0-0
		//1		0-1		0-2				
		//2		0-0		0-4	
		//3		- 		0-6
		//4		0-0		0-4
		//5		0-1		0-2
		//6		0-2		0-0
		//j>=2-i
		//k>=2*i
		
		int j=0;
		int i=0;
		int k=0;
		while(i<7)
		{
			if(i<=3)
			{
				j=0;
				while(j<=2-i)
				{
					System.out.print(" ");
					j++;
				}
				k=0;
				while(k<=2*i)
				{
					System.out.print("*");
					k++;
				}
			}
			else
			{
				j=0;
				while(j<=i-4)
				{
					System.out.print(" ");
					j++;
				}
				k=0;
				while(k<=12-(2*i))
				{
					System.out.print("*");
					k++;
				}
			}
			System.out.println();
			i++;
		}
	}

}
