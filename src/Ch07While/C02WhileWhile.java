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
		
		int i=0;
		int j=0;
		
		while(i<4)
		{
			j=0;
			while(j<5)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
