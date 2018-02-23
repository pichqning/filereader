import java.io.*;
import java.util.Scanner;

/**
 * 
 * @author Pichaaun Popukdee
 *
 */

public class Main {
	
 	public static void main(String[] args) {
		TaskTimer taskTimer = new TaskTimer();
		taskTimer.runTask(new AppendStringTask());
		taskTimer.runTask(new AppendStringBuilderTask());
		taskTimer.runTask(new AppendUsingBufferedReaderTask());
	}

}
