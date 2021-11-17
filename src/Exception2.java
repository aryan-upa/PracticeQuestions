import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ln = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        String[] arr = line.split(" ");
        try {
            int num = sc.nextInt();
            System.out.println("Element at "+ num +" is "+ arr[num]);
        }
        catch (InputMismatchException I) {
            System.err.println("Not a Valid a Input!");
            System.exit(1);
        }
        catch (IndexOutOfBoundsException I) {
            System.err.println("Index is out of Range!");
        }
    }
}
