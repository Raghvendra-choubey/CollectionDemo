package org.raghu.multithreading;
import java.lang.Runnable;
public class RunnableDemo implements Runnable {

	public int i = 0;
	@Override
	public void run() {
		System.out.println(i);
	}

}
