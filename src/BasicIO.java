import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.stream.events.Characters;


public class BasicIO {
	public static void main(String[] args) throws IOException{
		try {
			BufferedInputStream in = new BufferedInputStream(new FileInputStream("test.JPG"));
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("out.JPG"));
			int c;
			while(( c = in.read()) != -1){
				out.write(c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int stdin = System.in.read();
		char[] t = Character.toChars(stdin);
		System.out.println(t);
		

		
	}

}
