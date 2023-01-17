package thread02;

public class ThreadA extends Thread {
	public ThreadA() { //이름 설정 안할시 0 출력
		setName("ThreadA");
	}
	
	public void run() {
		for(int i = 0; i<2; i++) {
			System.out.println(getName()+"가 출력한 내용");
		}
	}
}
