package ch12.sec09;

public class StatePrintThread extends Thread {

	// 감시해야 할 스레드 객체 저장
	private Thread targThread;
	private boolean stopFlag;
	
	public StatePrintThread(Thread targThread) {
		super();
		this.stopFlag = false;
		this.targThread = targThread;
	}

	public void setStopFlag(boolean stopFlag) {
		this.stopFlag = stopFlag;
	}



	@Override
	public void run() {
		super.run();
		// 삼시할 스레드 상태를 파악해서 출력하는 스레드
		while (true) {
			// 감시해야할 스레드 상태정보를 가지고 온다 5가지 방법 new, RUNNABLE, run ,일시정지(blocked,waitting,Time
			// waitting, termainated
			State state = targThread.getState();
			System.out.println("타겟 스레드가 :" + state);
			if (state == Thread.State.TERMINATED) {
				System.out.println("타겟 스레드가 TERMINATED 되었다");
				break;
			} // while
			if (state == Thread.State.NEW) {
				System.out.println("타겟 스레드가 NEW 되었다");
				targThread.start();
			}
//			if (state == Thread.State.TIMED_WAITING) {
//				System.out.println("타겟 스레드가 TIMED_WAITING 되었다");
//			}
//			if (state == Thread.State.BLOCKED) {
//				System.out.println("타겟 스레드가 BLOCKED 되었다");
//			}
//			if (state == Thread.State.WAITING) {
//				System.out.println("타겟 스레드가 WAITING 되었다");
//			}

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
		}
	}

}