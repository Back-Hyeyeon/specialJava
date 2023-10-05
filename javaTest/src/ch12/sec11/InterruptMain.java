package ch12.sec11;

public class InterruptMain {

	public static void main(String[] args) throws InterruptedException {

		PrintThread pt = new PrintThread();
		pt.start();
		
		Thread.sleep(2000);
//		pt.stopFlag = true;
		if(pt.isDaemon() == true) {
			System.out.printf("작업스레드 데몬스레드입니다\n");
			
		}else {
			System.out.printf("작업스레드 독립스레드\n");
		}
		pt.interrupt();
		
		System.out.printf("main 스레드 종료\n");
	}

}
