package ch12.sec12;

public class PrintThread implements Runnable{

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
				System.out.println("작업내용을 실행하고 있다.");
			}
		}
		
		
	}


