/**
 * This class is represent the method that the stopwatch can do 
 * such as start, stop , 
 * @author Pichaun Popukdee
 *
 */
public class StopWatch{
	public static long startTime = 0;
	public static long stopTime = 0;
	private boolean running = false ;

	public void start() {
		running = true;
		startTime = ((long)System.nanoTime());
	}

	public void stop() {
		stopTime = (System.nanoTime());
		running = false;
	}
	
	public boolean isRunning() {
		return running;
	}
	
	public double getElapsed() {
		 if (running) {
			return (System.nanoTime() - startTime)*(1.0E-9);
		 } else {
			 return (stopTime - startTime )*(1.0E-9);
		 }
		}
	
	
}
