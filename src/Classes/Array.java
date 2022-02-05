package Classes;

import java.util.Scanner;

public class Array {
    /*
    Classes.Array syntax:
        datatype[] array_name = new datatype[array_size];
    Ex:
        int[] arr = new int[5];
        The syntax works as,
        int -> tells the compiler to allocate a memory space to hold an int type value, The [] 'square braces' define
            that the variable defined ahead is going to hold a memory word not a value, it is stored in the stack
            memory.
        arr -> Name of the variable, that is going to hold the memory address of the first element in the array.
        new -> Tells the compiler to assign the space in memory.
        int[5] -> Tells the compiler to assign 5 sequential memory spaces of int datatype size.

    It holds the value as...
    when int[] arr;
        Then this makes a block of memory of 4 bytes in the stack memory, but this type of memory can only hold address.
        The default value in this memory block is 'null'. Every address holding variable has the default value of null.
    arr = new int[5];
        This line does 2 actions...
            1. It assigns 5 blocks of sequential memory in the heap. The sequential memory is the one, which comes one
            after the other.
            2. It assigns the address of the first block of that sequential memory to the address containing variable,
                in this case, arr.
    In array...
        1. Indexing is allowed, as per norms ( 0 to size-1 ).
        2. Negative indexing or indexing after the range is not allowed.
    Types of array declaration:
        int[] arr = new int[5];

        int[] arr;
        arr = new int[5];

        int[] arr = {1,2,3,4,5};

        // Important
        int[] arr = new int[]{1,2,3,4,5};

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var n = 0;
        System.out.println("Enter the number of elements in the array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        int eve = 0, odd = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]%2==0)
                eve+=1;
            else
                odd+=1;
        }
        System.out.println("No. of odds : " + odd);
        System.out.println("No. of evens : " + eve);

        float[] arr2 = new float[5];
    }
}

