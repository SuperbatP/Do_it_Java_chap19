package sec04_filterinputoutputstream.EX04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
public static void main(String[] args) {
	//File 객체 생성
	File outFile1 = new File("src\\sec04_filterinputoutputstream\\EX01\\files\\PrintStream1.txt");
	File outFile2 = new File("src\\sec04_filterinputoutputstream\\EX01\\files\\PrintStream2.txt");
	
	//PrintStream(FileOutputStream(File))
	try(OutputStream os1 = new FileOutputStream(outFile1);
		PrintStream ps = new PrintStream(os1);){
		ps.println(5.8);
		ps.print(3+"안녕"+12345+"\n");
		ps.printf("%d",7).printf("%s %f","안녕",5.8);//printf는 자기 자신을 return가능함.
		ps.println();
	}catch(IOException e) {}
	
	//PrintStream(File)
	try(PrintStream ps = new PrintStream(outFile2);){
		ps.println(5.8);
		ps.print(3+"안녕"+12345+"\n");
		ps.printf("%d",7).printf("%s %f","안녕",5.8);//printf는 자기 자신을 return가능함.
		ps.println();
	}catch(IOException e) {}
	
	//PrintStream ps = System.out
	try(OutputStream os2 = System.out;
		PrintStream ps = new PrintStream(os2);	){
		ps.println(5.8);
		ps.print(3+"안녕"+12345+"\n");
		ps.printf("%d",7).printf("%s %f","안녕",5.8);//printf는 자기 자신을 return가능함.
		ps.println();
	}catch(IOException e) {}

	
}
}
