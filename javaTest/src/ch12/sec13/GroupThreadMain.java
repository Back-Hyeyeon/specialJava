package ch12.sec13;

import java.util.Map;
import java.util.Set;

public class GroupThreadMain {

	public static void main(String[] args) {

		PrintThread pt = new PrintThread("헤연작업스레드 ");
		//데몬스레드
		pt.setDaemon(true);
		//우선순위 최고10
		pt.setPriority(Thread.MAX_PRIORITY);
		pt.start(); 
		
		//소속그룹을 출력하는(경험)
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> set = map.keySet();
		//이터레이터 향상된포문 줄중 하나.
		for(Thread data:set){
			System.out.printf("스레드 이름: %s \n",data.getName());
			System.out.printf("데몬: %s \n",data.isDaemon() ? "데몬":"독립");
			ThreadGroup tg = data.getThreadGroup();
			System.out.printf("소속그룸: %s \n",tg.getName());
		}
		System.out.printf("메인스레드 종료랍니다.");
	}

}
