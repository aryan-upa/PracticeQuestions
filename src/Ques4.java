import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Stu"+(i+1));
            System.out.print("Enter Height"+(i+1));
            arr[i][0] = sc.nextInt();
            System.out.print("Enter Age"+(i+1));
            arr[i][1] = sc.nextInt();
            System.out.print("Enter Marks"+(i+1));
            arr[i][2] = sc.nextInt();
        }

        var MaxH = arr[0][0];
        for (int i = 1; i < 3; i++)
            if (arr[i][0]>MaxH)
                MaxH = arr[i][0];

        var MaxM = arr[0][2];
        for (int i = 1; i < 3; i++)
            if (arr[i][2]>MaxM)
                MaxM = arr[i][2];

        var MaxA = arr[0][1];
        for (int i = 1; i < 3; i++)
            if (arr[i][1]>MaxA)
                MaxA = arr[i][1];

        System.out.println("Maximum Height : " + MaxH);
        System.out.println("Maximum Age : " + MaxA);
        System.out.println("Maximum Marks : " + MaxM);

    }
}
