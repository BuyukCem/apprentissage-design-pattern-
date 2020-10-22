package patternDecorateurESJava;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestEntree {
	public static void main(String[] args) throws IOException {
		int c; 
		try {
			InputStream in =  new MinusuleInputStream(     
					new BufferedInputStream(   
							new FileInputStream("test.txt")));    
			while((c = in.read()) >= 0) {
				System.out.print((char)c);     
				}     in.close(); } 
		catch (IOException e) { 
			e.printStackTrace(); 
			}
		}
}
