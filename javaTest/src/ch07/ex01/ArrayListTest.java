package ch07.ex01;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayListTest {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Student> stu = new ArrayList<Student>();
		Student[] student = new Student[2];

		System.out.printf("학생 이름, 학과,학번, 학점평균을 입력하세요\n");
		String note = null;
		for (int i = 0; i < student.length; i++) {
			System.out.printf(">>");
			note = sc.nextLine();
			StringTokenizer st = new StringTokenizer(note, ",");

			String name = st.nextToken().trim();
			String major = st.nextToken().trim();
			String num = st.nextToken().trim();
			String avg = st.nextToken().trim();
			student[i] = new Student(name, major, num, avg);
			stu.add(student[i]);
		}
		for (int i = 0; i < stu.size(); i++) {
			Student st = stu.get(i);
			System.out.printf(st.toString());
			System.out.printf("================\n");
		}

		while (true) {
			System.out.printf("학생 이름: >>");
			String name = sc.nextLine().trim();
			if (name.equals("그만")) {
				System.out.printf("검색을 종료합니다.\n");
				break;
			} else if (name == null) {
				sc.nextLine();
				System.out.printf("없는 단어입니다\n");
				break;
			}
			for (int i = 0; i < stu.size(); i++) {
				Student s = stu.get(i);
				s.findStudent(name);
			}
		}

		System.out.printf("end");
	}

}
