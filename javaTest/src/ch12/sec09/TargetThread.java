package ch12.sec09;

public class TargetThread extends Thread {

	@Override
	public void run() {
		super.run();
		for (long i = 0; i < 2_000_000_000; i++) {
			// 실행상태
		}
		// Time waitting(1.5초 : 일시정지 상태)
		try {
			Thread.sleep(1500);
		} catch (Exception e) {

			e.printStackTrace();
		}
		for (long i = 0; i < 2_000_000_000; i++) {
			// 실행상태
		}
	}

}
