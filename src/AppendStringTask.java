import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AppendStringTask implements Runnable{
	private long size;

	@Override
	public void run() {
		String data = readFileToString("src/Alice-in-Wonderland.txt");
		size = data.length();
	}
	public static String readFileToString (String filename) {
		String result = new String();
		try {
			InputStream in = new FileInputStream(filename);
			InputStreamReader reader = new InputStreamReader(in);
			int c ;
			while (true) {
				c = reader.read();
				if(c<0) break;
				result = result + (char) c;
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
