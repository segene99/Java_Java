package thread01;

public class BeepTask implements Runnable {
	
	public void run() {
		
		for(int i=0; i<5; i++) {
			System.out.println("동");
		try {Thread.sleep(200);
			}catch (Exception e) {}
		
		}
}
}