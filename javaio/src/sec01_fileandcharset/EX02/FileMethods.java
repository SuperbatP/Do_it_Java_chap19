package sec01_fileandcharset.EX02;

import java.io.File;

public class FileMethods {
public static void main(String[] args) {
	File tempDir= new File("C:/temp");
	if(!tempDir.exists())
		tempDir.mkdir();
	
	//파일객체 생성
	File file = new File("C:/Windows");
	
	//파일메서드
	System.out.println("절대 경로: "+file.getAbsolutePath());
	System.out.println("폴더(?): "+file.isDirectory());
	System.out.println("파일(?): "+file.isFile());
	System.out.println("파일/폴더명: "+file.getName());
	System.out.println("부모 폴더: "+file.getParent());
	File newfile1 = new File("C:/temp/abc");
	System.out.println(newfile1.mkdir());//이미 존재하면 false 출력
	File newfile2 = new File("C:/temp/bcd/cde");
	System.out.println(newfile2.mkdir());//bcd 하나만 만듦
	System.out.println(newfile2.mkdirs());//bcd/cde 한번에 만듦
	File[] fnames = file.listFiles();
	for(File fname: fnames) {
		System.out.println((fname.isDirectory()? "폴더: " : "파일: ")+fname.getName());}
	
}
}
