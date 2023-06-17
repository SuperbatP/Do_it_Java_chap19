package sec05_readerwriter.EX02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedReaderWriter {
public static void main(String[] args) {
	//파일 객체 생성
	File readerWriterFile = new File("src\\sec05_readerwriter\\files\\BufferedFile.txt");
	//FileWiter를 이용한 파일쓰기
	try(Writer writer = new FileWriter(readerWriterFile);
		BufferedWriter bw = new BufferedWriter(writer);){
		bw.write("안녕하세요\n".toCharArray());
		bw.write("Hello");
		bw.write('\r');
		bw.write('\n');
		bw.write("반갑습니다.",2,3);
		bw.flush();
	}catch(IOException e) {}
	
	//Filereader를 이용한 파일읽기
	try(Reader reader = new FileReader(readerWriterFile);
		BufferedReader br = new BufferedReader(reader);){
		String data;
		while((data=br.readLine())!=null)//한 글자가 아닌 한 줄+엔터 씩 읽기
		System.out.println(data);
	}catch(IOException e) {}
}
}
