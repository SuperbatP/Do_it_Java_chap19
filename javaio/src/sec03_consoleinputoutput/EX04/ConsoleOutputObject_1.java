package sec03_consoleinputoutput.EX04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ConsoleOutputObject_1 {
public static void main(String[] args) throws IOException {
	OutputStream os = System.out;
	//1-byte  단위 쓰기
	os.write('J');
	os.write('A');
	os.write('V');
	os.write('A');
	os.write('\r');//13 생략가능
	os.write('\n');//10 개행 \r\n
	os.flush();//write다음엔 flush 무조건 쓴다고 생각함.

	//n-byte  단위 쓰기 byte[]의 처음부터 끝까지 데이터 저장
	byte[] byteArray1 = "Hello!".getBytes();
	os.write(byteArray1);
	os.write('\n');
	os.flush();
	
	//n-byte  단위 쓰기 byte[]의 offset부터 length개의 byte 데이터 저장
	byte[] byteArray2 = "Better the last smile than the first laugter".getBytes();
	os.write(byteArray2, 7, 8);
	os.flush();

	
}
}
