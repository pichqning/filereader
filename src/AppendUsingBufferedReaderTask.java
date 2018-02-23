import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AppendUsingBufferedReaderTask implements Runnable {
	private long size;
	@Override
	public void run() {
		String data = readFileToStringBuffer("src/Alice-in-Wonderland.txt");
		size = data.length();
		
	}
	
	public static String readFileToStringBuffer(String filename) {
		String result = "";
		try {
			FileReader in = new FileReader(filename);
			BufferedReader reader = new BufferedReader(in);
			String readline = reader.readLine();
			while (readline != null) {
				result = result + readline + '\n';
				readline = reader.readLine();
				}
			in.close();
			} catch ( IOException ex) {
				System.out.println(ex.getMessage());
			}
		return result;
		}
	@Override
	public String toString() {
		return String.format("Read file line at a time to String: read %d chars",size);
	}
}
