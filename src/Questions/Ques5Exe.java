package Questions;

import java.lang.Math;
import java.util.Scanner;

class MyCalculator0 {
    long power(int n, int p) throws java.lang.Exception {
        if(n==0 && p==0)
            throw new java.lang.Exception("n and p can not be zero.");
        if(n<0 || p<0)
            throw new java.lang.Exception("n or p can not be less than zero.");
        return (long) Math.pow(n,p);
    }
}

public class Ques5Exe{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCalculator0 obj = new MyCalculator0();
        try {
            System.out.println(obj.power(sc.nextInt(), sc.nextInt()));
        }
        catch (java.lang.Exception E){
            System.err.println(E);
        }
    }
}