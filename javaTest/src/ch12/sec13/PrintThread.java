package ch12.sec13;

public class PrintThread extends Thread{
	
	
	
	public PrintThread(String name) {
		this.setName(name);
	}

	@Override
	public void run() {
		while(true) {
			System.out.printf("%s작업내용을 실행합\n",this.getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}
	
	

}
