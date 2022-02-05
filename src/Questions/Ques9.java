package Questions;

import java.util.Scanner;

public class Ques9 {
    boolean checkStr(String a, String b) {
        return a.equalsIgnoreCase(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ques9 obj = new Ques9();
        System.out.print("Enter the first string : "); String str1 = sc.nextLine();
        System.out.print("Enter the second string : "); String str2 = sc.nextLine();
        if(obj.checkStr(str1,str2)) System.out.println("Strings are same.");
        else System.out.println("Strings are not same.");
    }
}
