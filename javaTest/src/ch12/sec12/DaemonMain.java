package ch12.sec12;

public class DaemonMain {

	public static void main(String[] args) throws InterruptedException {

		Runnable runnable = new PrintThread();
		Thread thread = new Thread(runnable);
		//독립스레드를 데몬스레드로 바꾼다.
		thread.setDaemon(true);
		thread.start();
		
		Thread.sleep(2000);
		
		System.out.printf("메인 끝\n");
	}

}
