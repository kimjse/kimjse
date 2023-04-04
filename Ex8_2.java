package pj0323;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//방법1
			FileInputStream fin = new FileInputStream("c:\\자바강의\\qjw.jpg");
			BufferedInputStream bin = new BufferedInputStream(fin);
			//방법2
			//BufferedInputStream bin = new BufferedInputStream(new FileInputStream("c:\\자바강의\\qjw.jpg"));
			
			//FileOutputStream fout = new FileOutputStream("c:\\자바강의\\copy.jpg");
			//BufferedOutputStream bout = new BufferedOutputStream(fout);
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("c:\\자바강의\\copybuffer.jpg"));
			
			int c;
			while ( (c = fin.read()) != -1) {
				bout.write(c);
	
			}
			System.out.println("복사되었습니다.");
			bin.close();
			bout.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("에러 발생");
		} 
	}

}
