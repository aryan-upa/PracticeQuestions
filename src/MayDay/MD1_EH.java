package MayDay;

import java.util.Scanner;

public class MD1_EH {
    /*
    Classes.Exception:
    An unwanted unexpected event that occurs during the execution of a program that disrupts the normal flow of
        execution is nothing but exception
        Ex: Attempting a file that does not exist,
            Accessing index out of bounds, etc.

    Runtime errors are exception.

    Advantages of Classes.Exception Handling
        1. Separate Error Handling code from the regular code.
           -- It provides the means to separate the details of what to do when an exception occurs. [something out of
           main logic ].

        2. Propagating Errors up the call Stack.
           -- It tells us exactly where and in what manner we can reach the point where the exception has been generated

        3. Grouping and Differentiating error types.
           -- We can make a group of all types of related exception like the exception in the Examples.Input Output are in the
                IOException in the java.io .

    Errors
        These are also the problems occurring during the run-time of the program but theses are generally
        out of the scope of user programs
        Ex: Out of Memory, Hard Disk Crash
     */

    /*
    try : where we think the exception can occur
    catch : the block of code we write as what we want the compiler to do if such an state occurs.
    finally : the block of code that will run no matter whether the code goes in try or catch. Used to close the
        resources accessed in the try block. It also helps us in determining in what executed, whether try or catch.
        We write clean up code in the final block.

    The try block creates an exception type object & then sends it to the catch block to execute.
    Once the cursor moves out the try block then it never comes back into it, therefore it is not advised to write the
        whole code in the try block.

    Checked Classes.Exception : The Exceptions which are checked by the compiler during compile time for smoother execution of
        the program at runtime.
            -> FileNotFoundException

    Unchecked Classes.Exception : Which are not checked by the compiler at compile time whether the programmers handle the code
        exception or not, these are checked at the run-time.
            -> Arithmetic Classes.Exception

    We can also write try without catch using finally.
    There can be multiple catch block but only 1 final block.

    We can also create our own Classes.Exception by extending the Classes.Exception class.

    Throw -> The throw keyword is used to throw an Classes.Exception

    Throws -> The throws keyword is used to declare exception. It specifies that there may occur an exception in the
        method. It doesn't throw an exception. It is always used with method signature.

    final : access modifier, using which makes sure that the value can not be changed further, with method it makes sure
        that it can not be overloaded or overridden further.

    finally : It is a block in Classes.Exception Handling.

    finalize : It is a method of the object class. It is used to do the cleanup processing just before the object is
        garbage collected. It is executed just before the object is destroyed.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Basic try-catch-finally
        try{
            Integer I = sc.nextInt();
        }
        catch (NumberFormatException E){
            System.out.println("The input is not in proper number format.");
        }
        finally {
            System.out.println("This is the finally block being Executed.");
        }

        //Nested try-catch
        try{
            int x = sc.nextInt();
            try{
                int j = 100/x;
                System.out.println(x);
            }
            catch (ArithmeticException E){
                System.out.println("Classes.Exception Occurred in Inner Try : \n"+E);
            }
        }
        catch (NumberFormatException E){
            System.out.println("Classes.Exception Occurred in Outer Try : \n" +E);
            //We can also put try and finally here.
        }

        // throw Keyword usage.
        int p = sc.nextInt();
        try{
            if(p==0)
                throw new java.lang.Exception("New Excption");
            else
                p++;
        }
        catch (java.lang.Exception e) {
            System.out.println("Classes.Exception Catched from throw Keyword " + e);
        }
        finally {
            System.out.println(p);
        }

        /*
        An exception is first thrown from the top of the stack and if it is not caught, it drops down to the call stack
            to the previous method. If not caught there, the exception again drops down to the previous method, and so
            on until they are caught or until they reach the very bottom of the call stack. This is called exception
            propagation.
         */
        MD1_EH obj = new MD1_EH();
        obj.f3();

        try{
            throw new NewException();
        }
        catch (NewException e) {
            System.out.println(e);
        }

        try{
            throw new NewException("This is another one.");
        }
        catch (java.lang.Exception e){
            System.out.println(e);
        }

        //try with resource
        try(Scanner er = new Scanner(System.in)){
            System.out.println("The Scanner here is a resource.");
        }
        //We don't have to use the finally block here as the Scanner object er implicitly calls the
        //  er.close() method, which closes the resource itself.

        try{
            //If we open some sort of file here and then some exception is occurred then to close the file we use
            // finally block.
        }
        finally {
            // Here we can close that resource.
        }
    }

    void f1(){
        int num = 1/0;
    }
    void f2(){
        f1();
    }
    void f3(){
        try{
            f2();
        }
        catch (java.lang.Exception E){
            System.out.println("Classes.Exception Handled in the f3.");
        }
    }


}

// Creating Custom Classes.Exception
class NewException extends java.lang.Exception{
    NewException(){
        super("This is a new Classes.Exception.");
    }
    NewException(String s){
        super(s);
    }
}


