import java.io.*;
import java.util.Scanner;

/**
 * 
 * @author Pichaaun Popukdee
 *
 */

public class TaskTimer {
	public static StopWatch watch = new StopWatch();
	
	public static void reset(StopWatch a) {
		a.startTime = 0;
		a.stopTime = 0;
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
	
	public static void testFileToString () {
		String alice = readFileToString("src/Alice-in-Wonderland.txt");
		System.out.println("Reading Alice-in-Wonderland.txt using FileReader, append to String.");
		System.out.printf("Read %d chars in %.6f sec.\n" , alice.length(),watch.getElapsed());
	}
	public static void testFileToStringBuilder () {
		String alice = readFileToStringBuilder("src/Alice-in-Wonderland.txt");
		System.out.println("Reading Alice-in-Wonderland.txt using FileReader, append to StringBuilder.");
		System.out.printf("Read %d chars in %.6f sec.\n" , alice.length(),watch.getElapsed());
	}
	public static void testFileBuffer () {
		String alice = readFileToStringBuffer("src/Alice-in-Wonderland.txt");
		System.out.println("Reading Alice-in-Wonderland.txt using BufferReader, append to String.");
		System.out.printf("Read %d chars in %.6f sec.\n" , alice.length(),watch.getElapsed());
		
	}
 	public static void main(String[] args) {
		watch.start();
		testFileToString();
		watch.stop();
		reset(watch);
		watch.start();
		testFileToStringBuilder();
		watch.stop();
		reset(watch);
		watch.start();
		testFileBuffer();
		watch.stop();
	
	}

}
