package thread03_001_unsychronized;

public class Calculator {
	private int memory; //멤버변수
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) { 
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}
