package pj0323;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//방법1 
			FileReader fin = new FileReader("c:\\자바강의\\test.txt");
			BufferedReader bin = new BufferedReader(fin);
			//방법2
			//BufferedReader bin = new BufferedReader(new FileReader("c:\\자바강의\\test.txt"));
			//FileWriter fout = new FileWriter("c:\\자바강의\\copy.txt");
			//BufferedWriter bout = new BufferedWriter(fin);
			BufferedWriter bout = new BufferedWriter(new FileWriter("c:\\자바강의\\copybuffer.txt"));
			int c;
			while(( c = fin.read()) != -1) {
				System.out.print((char)c);
				bout.write(c);
			}
			bin.close();
			bout.close();
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일없음 에러~");
		}catch (IOException e) {
			e.printStackTrace();
			// TODO handle Exception
			System.out.println("파일 read 에러~");
		} catch (Exception e) {
			// TODO handle Exception
			e.printStackTrace();
			System.out.println("에러 났어요...");
		}

	}
}


