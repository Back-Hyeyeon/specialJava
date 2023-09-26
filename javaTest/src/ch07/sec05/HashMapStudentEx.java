package ch07.sec05;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapStudentEx {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		HashMap<String,Student> map = new HashMap<String,Student>();
		
		//3명 저장
		map.put("황기태", new Student(1,"010-1111-1111"));
		map.put("이재문", new Student(2,"010-2222-1111"));
		map.put("김남윤", new Student(3,"010-3333-1111"));
		
		Set<String> key = map.keySet();
		for(String data : key) {
			System.out.printf("학생이름=%s \t %s \n",data,map.get(data));
		}
		
		while(true) {
			System.out.printf("검색할 이름>>");
			String name = sc.nextLine().trim();
			if(name.equals("exit")) {
				System.out.printf("종료합니다.");
				break;
			}
			Student student = map.get(name);
			if(student == null) {
				System.out.printf("name = %s\n",name);
			}else {
				System.out.printf("id : %d, tel : %s\n",student.getId(),student.getTel());
			}
			
		}

	}

}
