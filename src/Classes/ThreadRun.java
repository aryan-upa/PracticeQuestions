package Classes;

public class ThreadRun extends Thread{
    public void run() {
        System.out.println("While I am printing something.");
    }

    public static void main(String[] args) {
        Thread obj = Thread.currentThread();
        System.out.println("name of main thread : " + obj.getName());

        for(int i = 0; i<10; i++){
            System.out.println("num is : "+i);
        }
    }
}


/*
Sleep method creates a checked exception which must be caught, it gives interrupted exception which must be
placed inside the try block and a catch block must be there to catch it.

Placing a negative value inside the Sleep method also raises an exception.
 */


/*
getName : returns the name of the thread object.
setName : sets name of the object thread.
Thread.currentThread : returns the name of the current thread in execution.
start : method creates the block of that object in the thread execution and it implicitly calls the run method
    defined in that class of that object.
getPriority : Return the priority of the thread.
    Three integer value can be returned :

setPriority : Sets the priority of the thread in execution.

 */