package Ch04Scanner;

import java.util.Scanner;

public class C05연습 {

	public static void main(String[] args) {
		//이름을 입력하세요 : 홍길동
		//홍길동 님의 나이를 입력하세요 : 34
		//홍길동 님의 주소를 입력하세요 : 대구광역시 달서구 ~~0동
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name=sc.next();
		System.out.print(name + "님의 나이를 입력하세요 :");
		int age = sc.nextInt();
		System.out.print(name + "님의 주소를 입력하세요 :");
		sc.nextLine();
		String add=sc.nextLine();
		
		System.out.print("[PROFILE]\n");
		System.out.print("이름 :"+name);
		System.out.print("나이 :"+age);
		System.out.print("주소 :"+add);
		

	}

}
