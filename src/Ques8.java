import java.util.Scanner;

public class Ques8 {
    boolean check_array(int[] a, int[] b){
        for (int i = 0; i < a.length; i++)
            if(a[i] != b[i])
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ques8 obj = new Ques8();
        System.out.print("Enter the length of array : ");
        int L = sc.nextInt();
        int[] a = new int[L], b = new int[L];
        System.out.println("Enter the first array : ");
        for (int i = 0; i < L; i++) a[i] = sc.nextInt();
        System.out.println("Enter the Second array : ");
        for (int i = 0; i < L; i++) b[i] = sc.nextInt();
        if(obj.check_array(a,b)) System.out.println("Arrays are same.");
        else System.out.println("Array is not same.");
    }
}
