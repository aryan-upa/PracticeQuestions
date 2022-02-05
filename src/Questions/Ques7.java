package Questions;

import java.util.Scanner;

public class Ques7 {
    // write a program to input a string from the user and print the number of vowels present in it.
    int CountVows(String str){
        var st = 0;
        var nstr = str.toLowerCase();
        for (int i = 0; i < str.length(); i++)
            if( nstr.charAt(i) == 'a' || nstr.charAt(i) == 'e' || nstr.charAt(i) == 'i'
                    || nstr.charAt(i) == 'o' || nstr.charAt(i) == 'u')
                st+=1;
        return st;
    }

    public static void main(String[] args) {
        Ques7 obj = new Ques7();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        var str = sc.nextLine();
        System.out.println("The number of vowels : " + obj.CountVows(str));
    }
}
