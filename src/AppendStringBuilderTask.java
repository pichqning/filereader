import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AppendStringBuilderTask implements Runnable{
	private long size;
	@Override
	public void run() {
		String data = readFileToStringBuilder("src/Alice-in-Wonderland.txt");
		size = data.length();
		
	}
	
	public static String readFileToStringBuilder (String filename) {
		StringBuilder result = new StringBuilder();
		try {
			InputStream in = new FileInputStream(filename);
			InputStreamReader reader = new InputStreamReader(in);
			int c ;
			while (true) {
				c = reader.read();
				if(c<0) break;
				result.append((char)c);
			}
			in.close();
			} catch ( IOException ex) {
				System.out.println(ex.getMessage());
			}
		return result.toString();
		}
	
	@Override
	public String toString() {
		return String.format("Read file 1-char at a time to String: read %d chars",size);
	}

}
