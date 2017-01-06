package chapter13;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Hex {

	
	public static String format(byte[] data) {
		StringBuilder s = new StringBuilder();
		int n = 0;
		for (int i = 0; i < data.length; i++) {
			if (n % 16 == 0 ) {
				s.append("\n");
				s.append(String.format("%05x: ", n));
			}
			s.append(String.format("%02x ", data[i]));
			n++;
 		}
		s.append("\n");
		return s.toString();
	}
	
	public static void main(String[] args) {
		byte[] b = new byte[1024];
		try {
			File file = null;
			if( args.length == 0) {
				file = new File("bin/chapter13/Hex.class");
			} else {
				file = new File(args[0]);
			}
			System.out.println( file.getAbsolutePath() );
			BufferedInputStream bin = new BufferedInputStream(new FileInputStream(file));
			try {
				while (bin.read(b) != -1) {
					System.out.println( Hex.format(b) );
				}
			} finally {
				bin.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
