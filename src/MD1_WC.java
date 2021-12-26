public class MD1_WC<abc> {
    /*
     Wrapper Classes in Java Provides a mechanism to convert primitive into object and
        object into primitive.
     J2SE 5.0 introduced the features of Auto-Boxing and Auto-Unboxing
     */

    /*
    Use Cases of Wrapper Classes
    1. As Java only Supports Call by Value, we can not change the value of a variable through a method,
        but with the help of wrapper classes we can do it because we pass objects to the method.
    2. Synchronization works only with objects in Multithreading.
    3. All Collection FrameWorks such as ArrayList, LinkedList, HashSet etc. works only with objects.
     */

    /*
    Primitive   | Wrapper Class
    boolean         Boolean
    char            Character
    byte            Byte
    short           Short
    int             Integer
    long            Long
    float           Float
    double          Double

    It takes more memory space to store primitive as a Wrapper Class object.

     */

    /*
    Autoboxing
        The automatic conversion of primitive data type into its corresponding wrapper class is known as autoboxing,
        for example, byte to Byte, char to Character, and so on.
     */

    int a = 10;
    Integer i = a; // autoboxing working internally as 'i = Integer.valueOf(a)'

    /*
    Unboxing
        The automatic conversion of wrapper type into its corresponding primitive type is known as unboxing. It is the
        reverse process of autoboxing.
     */

    Character c = new Character('a');
    char d = c;

    // ClassValue -> Method return the value stored in the Wraper Class Object.
    Integer e = new Integer(5);
    int f = e.intValue();
    byte g = e.byteValue(); // Invokes the object as byte and then returns the memory.
    float h = e.floatValue();

    // Can also work like
    Byte B = new Byte(e.byteValue());

    //toBinaryString
    String s = Integer.toBinaryString(e); // returns the binary string of e.

    // Similarly, we have toOctalString and toHexString.

    // Unboxing works with only not Null Values, if the object holds a null value, it raises NullPointerException.

    public static void main(String[] args) {
        /*
        Primitive wrapper classes are immutable in Java, we can not alter the object reference.
            For Example:
        */

        Integer abc = 10;
        // We created an object 'abc' pointing to value 10 in memory.

        abc += 1;
        // Now we incremented the value of the object by 1, but in reality the memory space where the values are
        // stored have infinite number of values and all sort of values so rather than changing the value that the
        // object 'abc' holds, now, it simply points to a new value '11'.

        Integer bcd = 11;
        // We instantiated another object of Integer Class with value 11.

        System.out.println(abc == bcd); // Whether the values of abc and def are same.
        System.out.println(abc.equals(bcd)); // Whether they point to the same value or not.

        // String to Integer
        String s = Integer.toString(445);
        System.out.println(s);

        // Byte value of integer.
        Integer i = 5;
        Byte b = i.byteValue();

        // String to Integer
        Integer j = Integer.parseInt("1001", 2);
            // Here the radix defines the base of the number.
        System.out.println(j);
    }

}

