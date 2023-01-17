package thread01;

import java.awt.Toolkit;

public class BeepPrintExample1 {

	public static void main(String[] args) {// method = thread
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // getDefaultToolkit() = windows의 기본이벤트 갖고오세요
		for(int i=0; i<5; i++) {
			toolkit.beep();
			System.out.println("띵");
			try {
				Thread.sleep(200); // 1sec = 1000 mili sec
			} catch(Exception e) {
			}
		}
		
		for(int i=0; i<5; i++) {
				System.out.println("동");
			try {Thread.sleep(200);
				}catch (Exception e) {		
			}
		}
	}
}

