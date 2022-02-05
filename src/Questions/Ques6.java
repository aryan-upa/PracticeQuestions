package Questions;

import java.util.Scanner;

public class Ques6 {
    int Sum(int...a){
        var sm = 0;
        for (int var: a) {
            sm+=var;
        }
        return sm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ques6 obj = new Ques6();
        System.out.println("2 Args : " + obj.Sum(10,20));
        System.out.println("3 Args : " + obj.Sum(10,20,30));
        System.out.println("4 Args : " + obj.Sum(10,20,30,40));
        System.out.println("5 Args : " + obj.Sum(10,20,30,40,50));
    }
}
