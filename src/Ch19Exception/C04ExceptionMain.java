package Ch19Exception;

public class C04ExceptionMain {

	public static void main(String[] args) {
	
	try {
	String data=null;
	System.out.println(data.toString());
	System.out.println(10/0);
	int arr[] = new int[3];
	arr[3]=10;
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	System.out.println("실행코드1");
	System.out.println("실행코드2");

	}

}
