package ch07.ex3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main2 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Student[] student = new Student[5];
		HashMap<String, Student> hm = new HashMap<>();
		
		System.out.println("미래장학금관리시스템입니다.");
		for(int i=0; i<student.length; i++) {
			System.out.print("이름과 학점 >> ");
			String name = sc.next();
			double av = sc.nextDouble();
			hm.put(name, new Student(name, av));
		}
		
		System.out.print("장학생 선발 학점 기준 입력>> ");
		double standard = sc.nextDouble();
		
		Set<String> keys = hm.keySet();
		for(String data:keys) {
			Student stu = hm.get(data);
			if(stu.getAv() >= standard) {
				System.out.printf("%s \n",stu.getName());
			}
		}
	}
}