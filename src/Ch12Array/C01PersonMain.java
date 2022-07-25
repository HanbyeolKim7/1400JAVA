package Ch12Array;

class C01Person
{
	String name;
	int age;
	String addr;
}

public class C01PersonMain {

	public static void main(String[] args) {
		
		//클래스자료형으로 배열을 만들게 되면
		//객체 위치값을 저장하는 참조변수가 된다
		//각 요소마다 객체를 생성하여 위치값을 저장해야지만
		//클래스 배열을 사용할 수 있다
		C01Person list[] = new C01Person[3];
		//오류발생!!
		list[0].name="홍길동";
		list[0].age=55;
		list[0].addr="창원";

	}

}
