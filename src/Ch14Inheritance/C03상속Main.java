package Ch14Inheritance;

class Employee{
	String name;
	int age;
	int worktime;
	public Employee(String)
	
}
class Partimer extends Employee{
	int hourlywage;
	int days;
	Partimer(String name, int age, int worktime, int hw, int days)
	{
		super(name,age,worktime);	//상위클래스의 디폴트생성자 호출(기본값)
		hourlwage = hw;
		this.days=days;
	}
}
class Regular extends Employee{
	int salary;
	String title;
	Regular(String name, int age, int worktime, int s, String t)
	{
		super(name,age,worktime); //상위클래스의 디폴트생성자 호출(기본값)
		salary = s;
		title = t;
	}
	@Override
	public String toString() {
		return "Regular [salary=" + ",title="
	}
	
}

public class C03상속Main {

	public static void main(String[] args) {
		
		PartTimer hong = new PartTimer("홍길동",55,4,20000,90);
							//이름,나이,근무시간,시급,계약일수
		Regular kim = new Regular("김상중",44,8,3800,"대리");
							//이름,나이,근무시간,연봉,직책
		System.out.println(hong.toString());
		System.out.println(kim.toString());
	}

}