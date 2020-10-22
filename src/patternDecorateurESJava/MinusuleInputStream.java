package patternDecorateurESJava;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MinusuleInputStream  extends FilterInputStream{

	protected MinusuleInputStream(InputStream in) {
		super(in);
		// TODO Auto-generated constructor stub
	}

	public int read() throws IOException{
		int c = super.read();
		return (c == -1 ? c : Character.toLowerCase((char)c));
	}
	
	public int read(byte[] b, int decal, int lg) throws IOException { 
		int resultat = super.read(b, decal, lg);        
		for (int i = decal; i < decal+resultat; i++) {
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		return resultat;
	}
}
