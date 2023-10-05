package ch12.sec09;

public class ThreadMain {

	public static void main(String[] args) {
		//점검스레드
		TargetThread targetThread = new TargetThread();
		//감시해야항 스레드
		StatePrintThread spt = new StatePrintThread(targetThread);
		spt.start();
		spt.setStopFlag(true);
		System.out.printf("end\n");
		
	}

}
