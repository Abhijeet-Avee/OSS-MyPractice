package multithreading;
//run: it cannot return the processing result
//run method cannot throw the exception

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Thread.UncaughtExceptionHandler;

//run: it can not return the processing result
//run method can not throw the exception
class MyJob implements Runnable {

	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("foo.txt"));
			//
			System.out.println("file is found");
		} catch (FileNotFoundException ex) {
			System.out.println("file is not found");
			throw new RuntimeException(ex);
		}
	}

}

class MyThreadExcptionHandler2 implements UncaughtExceptionHandler{

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("exception is handled by 2"+ e);
	}
	
}

class MyThreadExcptionHandler implements UncaughtExceptionHandler{

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("exception is handled "+ e);
	}
	
}
public class ProblemWithRunnable {

	public static void main(String[] args) {
		//U need to create exception handler in java to handle ex from a threads
		
	
		MyJob job=new MyJob();
		Thread thread=new Thread(job);
		//Thread.setDefaultUncaughtExceptionHandler(new MyThreadExcptionHandler2());
		thread.setUncaughtExceptionHandler(new MyThreadExcptionHandler());
		thread.start();
		
		
	}

}