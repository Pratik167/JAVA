class MyThread extends Thread 
{
    public synchronized void run() 
    {
        for (int i = 1; i <= 3; i++) 
        {
            System.out.println(Thread.currentThread().getName() + " is running... " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
            System.out.println("Hi"+i);
        }
    }
}

public class multiTHread2 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();

        try {
            t1.join();  // Main thread waits for Thread1
            t2.join();  // Main thread waits for Thread2
        } catch (Exception e) {}

        System.out.println("Main thread finishes after Thread1 and Thread2.");
    }
}