
public class TaskTimer {
	public static void runTask (Runnable runnable) {
		StopWatch watch = new StopWatch();
		watch.start();
		runnable.run();
		watch.stop();
		System.out.println(runnable.toString());
		System.out.printf("Time using: %.4f sec.\n", watch.getElapsed());
	}

}
