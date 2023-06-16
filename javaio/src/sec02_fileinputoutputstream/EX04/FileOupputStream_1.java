package sec02_fileinputoutputstream.EX04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOupputStream_1 {
public static void main(String[] args) throws IOException {
	File outFile = new File("src\\sec02_fileinputoutputstream\\files\\FileOutputStream1.txt");
	//1-byte  단위 쓰기
	OutputStream os1 = new FileOutputStream(outFile);
	os1.write('J');
	os1.write('A');
	os1.write('V');
	os1.write('A');
	os1.write('\r');//13 생략가능
	os1.write('\n');//10 개행 \r\n
	
	os1.flush();//write다음엔 flush 무조건 쓴다고 생각함.
	os1.close();//file 폴더 누르고 f5 눌러 새로고침
	
	//n-byte  단위 쓰기 byte[]의 처음부터 끝까지 데이터 저장
	OutputStream os2 = new FileOutputStream(outFile, true);//내용 이어쓰기
	byte[] byteArray1 = "Hello!".getBytes();
	os2.write(byteArray1);
	os2.write('\n');
	
	os2.flush();
	os2.close();
	
	//n-byte  단위 쓰기 byte[]의 offset부터 length개의 byte 데이터 저장
	OutputStream os3 = new FileOutputStream(outFile, true);
	byte[] byteArray2 = "Better the last smile than the first laugter".getBytes();
	os3.write(byteArray2, 7, 8);
	
	os3.flush();
	os3.close();
	
}
}
