package sec01_fileandcharset.EX01;

import java.io.File;
import java.io.IOException;

public class CreateFileObject {
public static void main(String[] args) throws IOException {
	//c: temp폴더 생성
	File tempDir= new File("C:/temp");
	if(!tempDir.exists())
		tempDir.mkdir();
	System.out.println(tempDir.exists());
	
	//파일 객체 생성
	File newFile = new File("C:/temp/newFile.txt");
	if(!newFile.exists())
		newFile.createNewFile();
	System.out.println(newFile.exists());
	System.out.println();
	
	//파일 구분자
	File newFile2 = new File("C:\\temp\\newFile.txt");
	File newFile3 = new File("C:/temp/newFile.txt");
	File newFile4 = new File("C:"+File.separator+"temp"+File.separator+"newFile.txt");
	System.out.println(newFile2.exists());
	System.out.println(newFile3.exists());
	System.out.println(newFile4.exists());
	System.out.println();
	
	//절대경로
	File newFile5 = new File("C:/abc/newFile.txt");
	File newFile6 = new File("C:/abc/bcd/newFile.txt");
	System.out.println(newFile5.getAbsolutePath());
	System.out.println(newFile6.getAbsolutePath());
	
	
	//상대경로
	System.out.println(System.getProperty("user.dir"));
	File newFile7 = new File("newFile1.txt");
	File newFile8 = new File("bcd/newFile1.txt");
	System.out.println(newFile7.getAbsolutePath());
	System.out.println(newFile8.getAbsolutePath());
	
	
}
}
