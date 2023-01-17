package fileex;

import java.io.File;

public class FileEx09 {

	public static void main(String[] args) {
		try {
			File f = new File("c:/jwork/second/src/fileex", "FileEx01_00.java"); //path, file name
			
			System.out.println(f.getName()); //파일명
			System.out.println(f.exists()); //파일과 디렉토리 유무확인
			System.out.println(f.getPath()); //경로 및 파일명
			System.out.println(f.length()); //파일안의 문자열 기술
			System.out.println(File.separator); //구분자
			//boolean result = new File("c:/jwork/Exam/log").mkdir(); //Exam 까지만 만들어주기때문에 에러
			//boolean result = new File("c:/jwork/Exam").mkdir(); // Exam 만들어줌
			boolean result = new File("c:/jwork/Exam/log").mkdirs(); //Exam, log, 만들어줌
			
			if (result == true) {
				System.out.println("Exam 디렉토리 생성 성공");
			} else {
				System.out.println("Exam 디렉토리 생성 실패");
			}
			
			String[] listing = new File("c:/jwork/Exam").list();
			for(String x : listing) {
					System.out.println("디렉토리 목록 : " + x);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
