import java.util.Scanner;

public class Student3 {
    int roll,age;
    double height;

    public Student3() {
        this.age = 0;
        this.roll = 0;
        this.height = 0.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student3[] arr = new Student3[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = new Student3();
            System.out.println("Enter Details of Student " + (i+1));
            arr[i].roll = sc.nextInt();
            arr[i].age = sc.nextInt();
            arr[i].height = sc.nextDouble();
        }

        var sum = 0;
        for (int i = 0; i < 3; i++)
            sum += arr[i].age;

        System.out.println("The Average age is : " + (double)sum/3);
    }

}
