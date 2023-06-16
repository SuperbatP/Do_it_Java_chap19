package sec02_fileinputoutputstream.EX05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class FileOupputStream_2 {
public static void main(String[] args) throws IOException {
	File outFile = new File("src\\sec02_fileinputoutputstream\\files\\FileOutputStream2.txt");
	//n-byte  단위 쓰기 byte[]의 처음부터 끝까지 데이터 저장
	OutputStream os2 = new FileOutputStream(outFile, true);//내용 이어쓰기
	byte[] byteArray1 = "안녕하세요".getBytes(Charset.forName("UTF-8"));
	os2.write(byteArray1);
	os2.write('\n');
	
	os2.flush();
	os2.close();
	
	//n-byte  단위 쓰기 byte[]의 offset부터 length개의 byte 데이터 저장
	OutputStream os3 = new FileOutputStream(outFile, true);
	byte[] byteArray2 = "반갑습니다.".getBytes(Charset.defaultCharset());
	os3.write(byteArray2, 6, 6);
	
	os3.flush();
	os3.close();
}
}
