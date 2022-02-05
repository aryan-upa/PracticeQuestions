package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenericDemo<T> {
    public void fun1(List<? extends Number> mumma) { // using wildcard in Generic Programming.
        for (Number number : mumma) {
            System.out.print(number + " ");
        }
    }
}

class GenericDemoExe{
    public static void main(String...args) {
        GenericDemo<Integer> intObj = new GenericDemo<>();
        List<Integer> ls = new ArrayList<>();
        Random rand = new Random();
        for(int i=0; i<rand.nextInt(10000); i++) {
            ls.add(rand.nextInt(1000));
        }
        intObj.fun1(ls);
    }
}
