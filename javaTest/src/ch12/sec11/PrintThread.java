package ch12.sec11;

public class PrintThread extends Thread {

	public boolean stopFlag = false;
	
	@Override
	public void run() {
		while (!stopFlag) {
			
				System.out.printf("%s 작업스레드 실행중\n", this.getName());
//				Thread.sleep(500);
				if(Thread.interrupted()) {
					break;
					
				}
			
			
		}
		System.out.printf("작업스레드 정지 및 종료\n");
	}

}
