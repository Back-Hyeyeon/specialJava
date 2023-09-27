package ch07.ex2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMain {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();

        System.out.printf("4명의 학생,이름,학과,학번,학점평균을 입력하시오\n");
        for (int i = 0; i < 4; i++) {
            System.out.printf(">>");
            String[] data = scan.nextLine().trim().split(",");
            al.add(new Student(data[0], data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3])));
        }

        System.out.println("===========정보출력=============");
        Iterator<Student> ir = al.iterator();
        while(ir.hasNext()) {
            System.out.printf("%s \n",ir.next());
        }

        System.out.println("===========정보출력=============");

        while(true) {
            System.out.printf("학생이름>>");
            String name = scan.next().trim();
            System.out.printf("학생번호>>");
            int id = Integer.parseInt(scan.next().trim());
            Student findStu = new Student(name, id);
            boolean isfind = al.contains(findStu);
            if(isfind) {
            	System.out.printf("%s\n",al.get(al.indexOf(findStu)));
            }else {
            	System.out.printf("찾지 못했습니다.\n");
            }
        }
    }
}
