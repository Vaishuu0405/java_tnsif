package com.tnsif.multithreading;

public class JoinMain {
	public static void main(String args[]) {
		Join t1 = new Join();
        Join t2 = new Join();

        t1.start();
        try {
            t1.join();  // main waits until t1 finishes
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start();
	}

}
