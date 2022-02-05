package Questions;

import java.util.Scanner;

public class Ques5 {
    void replace(int[] arr, int i){
        // Replacing the given index with the value 121
        arr[i] = 121;
    }

    public static void main(String[] args) {
        Ques5 obj = new Ques5();
        Scanner sc = new Scanner(System.in);
        int L;
        System.out.print("Enter the length of the array : ");
        L = sc.nextInt();
        int[] a = new int[L];
        for (int i = 0; i < L; i++)
            a[i] = sc.nextInt();
        System.out.println("Enter the index to change : ");
        var i = sc.nextInt();
        System.out.println("Inputted array : ");
        for (int var : a) {
            System.out.print(var + " ");
        }
        obj.replace(a,i);
        System.out.println("\n Replaced Classes.Array : ");
        for (int var : a) {
            System.out.print(var + " ");
        }
    }
}
