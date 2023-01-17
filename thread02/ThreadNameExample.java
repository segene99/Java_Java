package thread02;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread(); //main
		System.out.println("프로그램 시작 스레드 이름: " +mainThread.getName());
		
		ThreadA threadA = new ThreadA(); //thread 0번
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB(); //thread 1번
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start();	
	}
}
