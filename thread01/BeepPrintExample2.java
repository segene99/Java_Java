package thread01;



public class BeepPrintExample2 {

	public static void main(String[] args) {
////	Runnable객체를 직접 생성하여 스레드생성자의 매개인자로 보내어 스레드 객체 생성
//		Runnable beepTask = new BeepTask();
//		Thread thread = new Thread(beepTask);
		
////		Runnable객체를 익명클레스로 생성하여 스레드생성자의 매개인자로 보내어 스레드 객체 생성 
//		Thread thread = new Thread(new Runnable() {
//				public void run() {
//					for(int i = 0; i<5; i++) {
//						System.out.println("하");
//						try {Thread.sleep(500);} catch(Exception e) {}
//					}
//				}
//		});
		
////	Runnable객체를 람다식으로 생성하여 스레드생성자의 매개인자로 보내어 스레드 객체 생성
//		Thread thread = new Thread(() -> {
//			for(int i =0; i<5; i++) {
//				System.out.println("띵");
//				try {Thread.sleep(500);} catch (Exception e) {}
//			}
//		});
//		thread.start(); // start() = thread execution
		
		for( int i = 0; i<5; i++) {
			System.out.println("호");
			try {Thread.sleep(500);} catch(Exception e) {}
		}	
	}
}
