package ch07.sec02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		// 선언
		String[] strArray = new String[10];
		ArrayList<String> strList = new ArrayList<String>();
		// 추가 및 가져와 출력
		for (int i = 0; i < 5; i++) {
			int no = (int) (Math.random() * (100 - 1 + 1) + (1));
			strArray[i] = new String("홍길동" + no);
			strList.add(new String("홍길동" + no));
		}
		printArryA(strArray, strList);

		strArray[1] = new String("저길동");
		strList.add(1, new String("저길동"));

		System.out.println("===================================");
		printArryA(strArray, strList);

		// 해당되는 객체가 존재하는지 확인
		boolean isFind = false;
		int indexOf = -1;
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] != null && strArray[i].equals("저길동")) {
				isFind = true;
				indexOf = i;
				break;
			}
		}

		System.out.printf("배열에 저길동ㅇㅣ %s \n", (isFind == true) ? "있어요" : "없어요");
		System.out.printf("배열에 저길동ㅇㅣ 위치는 %d \n", indexOf);
		System.out.printf("배열에 저길동ㅇㅣ %s \n", (strList.contains("저길동") == true) ? "있어요" : "없어요");
		System.out.printf("배열에 저길동ㅇㅣ위치는 %d \n", strList.indexOf("저길동"));

		// ArrayList를 toArray 배열로 변환
		Object[] obj = strList.toArray();
		for (Object data : obj) {
			System.out.printf("%s \t", ((String) data).toString());
		}
		System.out.println();
		// 배열을 ArrayList로 바꾼다?? Arrays.asList()
		List<String> list = Arrays.asList(strArray);
		for (String data : list) {
			System.out.printf(" %s \t", (data != null)? ((String) data).toString():"");
		}

		// 삭제 2번째위치 한다음 출력하기
		strArray[1] = null;
		strList.remove(1);
		System.out.println("\n===================================");
		printArryA(strArray, strList);

		// 전체를 클리어하다.
		for (int i = 0; i < strArray.length; i++) {
			strArray[i] = null;
		}
		strList.clear();
		System.out.printf("strArray.length = %d \n", strArray.length);
		System.out.printf("strList.size() = %d \n", strList.size());

		boolean isEmpty = true;
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] != null) {
				isEmpty = false;
			}
		}
		System.out.println("\n===================================");
		System.out.printf("strArray :%s \n", (isEmpty == true) ? "배열이 비어있어요" : "배열 값이있어요");
		System.out.printf("strList :%s \n", (strList.isEmpty() == true) ? "List 비어있어요" : "List 값이있어요");

		System.out.printf("\n end");
//		if(isEmpty==true) {
//			System.out.println("배열이 비어있어요");
//		}else {
//			System.out.println("배열 값이있어요");
//		}
	}

	private static void printArryA(String[] strArray, ArrayList<String> strList) {
		for (int i = 0; i < strList.size(); i++) {
			System.out.printf("strArray[%d]=%s \t", i, strArray[i]);
			System.out.printf("strList[%d]=%s \n", i, strList.get(i));

		}

	}

}
