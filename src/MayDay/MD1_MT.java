package MayDay;

public class MD1_MT {
    /*
    Multi-Tasking ------------------+
        |                           |
        |                           |
    MultiProcessing           MultiThreading
    * Expensive Transition   * Inexpensive Transition
    * Different Storage      * Same Process storage area.
        area.

    Advantages of MultiThreading
        * It doesn't block the user as the threads are independent and tou can perform multiple operations at the same time.
        * It saves time.
        * They do not affect other thread even if an exception occurs.
        * All threads are lightweight sub processes, the smallest unit of processing.

    Life Cycle of the thread:
        1. New -> Just created.
        2. Active -> Runnable -> Has to run but has not been allotted resources by the resource manager.
                  -> Running -> is in execution.
        3. Waiting/BLocked -> Is in waiting stage.
        4. Timed Waiting -> Has been put on waiting for a definite amount of time.
        5. Terminated -> Completed Questions.Execution.

    Two ways to make thread...
        extending thread class.
        implement runnable method.

    Runnable is a functional Interface as it has only 1 method named run().

     */

    /*
    Daemon Thread : minimum priority thread whose existence does not matter. Thread scheduler shuts down this thread
        forcefully shuts down this thread when program completes.
     */
    public static void main(String[] args) {
        //main thread

        Thread obj = Thread.currentThread(); //returns info about the current thread.
        obj.getName(); // returns the name of thread.
        obj.setName("abc"); //sets the name of the thread.
        obj.getPriority(); //returns the priority of the thread.

        /*
        Thread.MIN_PRIORITY = 1
        Thread.MAX_PRIORITY = 10
        Thread.NORM_PRIORITY = 5
         */

        obj.setPriority(5); //Sets the current thread priority to 5.
        obj.isAlive(); //return whether the thread is alive or not.

        obj.setDaemon(true); //makes the current thread as Daemon thread.
        obj.isDaemon(); // tells whether current thread is daemon or not.

        try {
            // all function in here throws InterruptedException
            Thread.sleep(1555);
            Thread.sleep(155,1241);
            // makes the thread which is in current execution fall asleep for number of milliseconds.

            obj.join();
            // It sends the current thread in execution to until the obj thread achieves the dead state.
            obj.join(152);
            // also works with milliseconds.

            Thread.yield();
            // Causes the current execution thread to go to pause momentarily.

            obj.wait();
            // it causes the current thread to release the lock & wait until another thread invokes notify or
            //      notify all.
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        obj.notify();
        // It wakes up a single thread which is in wait state on this object's monitor.

        obj.notifyAll();
        // It wakes up all the threads that are waiting on this object's monitor.

        obj.interrupt(); // Interrupts the thread.
        obj.isInterrupted(); // Tells whether the thread is interrupted or not.
    }
    /*
     We use synchronization to prevent thread interference and prevent consistency problem.
     Two Types:
        1. Process Synchronization
        2. Thread Synchronization
            2.1 Mutual Exclusive
                2.1.1 Synchronized Method
                2.1.2 Synchronized block
                2.1.3 Static Synchronization
            2.2 Cooperation
    Lock : It is an internal Entity, every object has it. Examples.A thread that needs consistent access to an object's fields
        has to acquire the object's lock before accessing them. The thread releases the locks after being done.
     */

    // Synchronized method
    synchronized void fun1(){
        System.out.println("Do some stuff.");
    }

    // Synchronized block
    public void fun2(int x){
        synchronized (this) {
            // The synchronized block locks the shared resource for a thread which is in execution using the resource so.
            // only 1 thread at a time has access to that shared resource.
            x += 5;
        }
    }

}

class Example1 extends Thread{
    public void run() {
        System.out.println("Run1");
    }
    public static void main(String[] args) {
        Example1 obj = new Example1();
        obj.start();
    }
}

class Example2 implements Runnable{
    // We do this, so we can extend another classes as well while using multi threading.
    public void run() {
        System.out.println("Run1");
    }
    public static void main(String[] args) {
        Example2 obj = new Example2();
        Thread abc = new Thread(obj);
        abc.start();
    }
}

// Lambda Expression in Threads
// Creating multiple run(s).
class Example3 extends Thread{
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 run inside.");
        });
        Thread t2 = new Thread(()-> {
            for (int i = 0; i < 5; i++)
                System.out.println(i);
        });
        t1.start();
        t2.start();
    }
}

//Lambda Expression
/*
    After Java 8 we have this. It provides the implementation of the functional interface. It saves us a lot of code.
 */

interface foo{
    void bar();
}
class Example4{
    public static void main(String[] args) {
        foo obj = () -> {
            System.out.println("Does something for sure.");
            //Implementation of public void bar.
        };
    }
}

