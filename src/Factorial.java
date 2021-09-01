import java.util.Scanner;

public class Factorial {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number to find factorial of : ");
          int num = sc.nextInt();
          int mul = 1;
          int fact = num;
          while(fact!=1){
               mul*=fact;
               fact-=1;
          }
          System.out.printf("The factorial of the given number %d is : %d",num,mul);
     }
}
