package MayDay;

import java.util.*;

class gen<T>{
    T show(){
        T t = null;
        return t;
    }
}

class genZ<T extends Number>{
    //only takes types associated with numbers as input.
}

/*
 Generic type invocation means when we replace the T in the generic class with some type name in the
 main function.

 <> is informally called The Diamond.

 There may be times when you want to restrict the types that can be used as type arguments in a parameterized type.
 For example, a method that operates on numbers might only want to accept instances of Examples.Number or its subclasses. This
 is what bounded type parameters are for.

 */

/*
Comparable : it is meant for default natural sorting.
Comparator : It is meant for customised sorting order.
 */
public class MD1_CG {
    public static void main(String[] args) {
        gen<Integer> IntGen = new gen<Integer>();
        gen<String> StringGen = new gen<>(); // Also works

        ArrayList I = new ArrayList();
            // Default initial capacit is 10;
        // It is not thread safe.
        //methods
        I.add(5);
        I.add(1,2);

        //I.addAll(Collection Args);
        I.set(0,3); //Replaces the object at 0 with 3
        I.get(1); //Returns the value at index 1;
        I.remove(0);
        I.listIterator();
        I.indexOf(1);
        I.lastIndexOf(1);


    }
}
