import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static String readFile1 (String filename) {
		String data = "";
		try {
			InputStream in = new FileInputStream(filename);
			InputStreamReader reader = new InputStreamReader(in);
			int c ;
			while (true) {
				c = reader.read();
				if(c<0) break;
				data = data + (char) c ;
			}
			in.close();
			} catch ( IOException ex) {
				System.out.println(ex.getMessage());
			}
		return data;
		}
	
	public static String readFile2 (String filename) {
		String data = "";
		try {
			FileReader in = new FileReader(filename);
			BufferedReader reader = new BufferedReader(in);
			String readline = reader.readLine();
			while (readline != null) {
				data += readline;
				readline = reader.readLine();
				}
			} catch ( IOException ex) {
				System.out.println(ex.getMessage());
			}
		return data;
		}
	
	public static String readFile3 (String filename) {
		String data = "";
		try{
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			data = data + sc.nextLine();
		}}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return data;
		}
	
	
	public static void main(String[] args) {
		StopWatch watch = new StopWatch();
		watch.start();
		String alice = readFile1("src/Alice-in-Wonderland.txt");
		watch.stop();
		System.out.printf("Read %d chars in %.6f sec.\n" , alice.length(),watch.getElapsed());
		watch.reset();
		watch.start();
		String alice2 = readFile2("src/Alice-in-Wonderland.txt");
		watch.stop();
		System.out.printf("Read %d chars in %.6f sec.\n" , alice2.length(),watch.getElapsed());
		watch.reset();
		watch.start();
		String alice3 = readFile3("src/Alice-in-Wonderland.txt");
		watch.stop();
		System.out.printf("Read %d chars in %.6f sec.\n" , alice3.length(),watch.getElapsed());
	}

}
