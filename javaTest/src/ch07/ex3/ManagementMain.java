package ch07.ex3;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class ManagementMain {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		HashMap<String,Student> hm = new HashMap<String, Student>();
		
		System.out.printf("미래장학금관리시스템.\n");
		
		
		hm.put("적당히", new Student("적당히", 3.1));
		hm.put("나탈락", new Student("나탈락", 2.1));
		hm.put("최고조", new Student("최고조", 4.2));
		hm.put("상당히", new Student("상당히", 3.9));
		hm.put("고들점", new Student("고들점", 4.1));
		
	
		
		System.out.printf("장학생 선발 학점 기준 입력>>");
		double scre = sc.nextDouble();
		
		Set<String> keyset = hm.keySet();
		for(String data:keyset) {
			Student stu = hm.get(data);
			if(stu.getAv() >= scre) {
				System.out.printf("%s \n",stu.getName());
			}
			
		}
		
		sc.close();
		System.out.printf("end");
	}

}
