package thread02;

public class ThreadB extends Thread{
	
	public ThreadB() { // 이름 설정 안할시 1 출력
		setName("ThreadB");
	}

	public void run() {
		for(int i = 0; i<2; i++) {
			System.out.println(getName()+"가 출력한 내용");
		}
	}
}
