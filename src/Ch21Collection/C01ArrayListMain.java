package Ch21Collection;

import java.util.ArrayList;
import java.util.List;

public class C01ArrayListMain {
	public static void addDTO(List<BoardDTO> list, BoardDTO dto) {
		
	}
	public static void ShowDTO(List<BoardDRO> list) {
		
	}
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		
		list.add("JAVA");
		list.add("JSP");
		list.add("Servlet");
		list.add("Sprint framework");
		list.add("Spring boot");
		list.add("JAVA");
		list.add(1,"TEST");
		
		list.remove(4);
		
		System.out.println("저장 개수 : " + list.size());
		System.out.println("-------------------------");
		for(String str : list)
		{
			System.out.println(str);
		}
		System.out.println("-------------------------");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(1));
		}

	}

}
