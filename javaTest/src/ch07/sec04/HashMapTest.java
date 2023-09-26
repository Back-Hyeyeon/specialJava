package ch07.sec04;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HashMap<String, String> hmDic = new HashMap<String, String>();

		// HashMap 추가(삽입)
		hmDic.put("babt", "아기");
		hmDic.put("love", "사랑");
		hmDic.put("apple", "사과");
		//key 객체를 중복했을때 이전의 벨류는 사라진다
		hmDic.put("apple", "사과2");

		// HashMap 출력(set으로 k객체를 바꾼다.)
		Set<String> kset = hmDic.keySet();
		for (String key : kset) {
			System.out.printf("key=%s \t value=%s \n", key, hmDic.get(key));
		}

		// 검색기능 "exit"나가기
		while (true) {
			System.out.printf("검색단어(종료:exit )>>");
			String search = sc.next().trim();
			if (search.equals("exit") || search.equals("EXIT")) {
				System.out.printf("단어검색dmf 종료합니다.");
				break;
			}
			System.out.printf("%s >> %S \n",search,hmDic.get(search));
		}

		System.out.printf("\n end");

	}
}