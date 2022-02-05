package Examples;

import java.util.Scanner;

interface AdvancedAtithmatic{
    int divi_sum(int n);
}

public class MyCalculator implements AdvancedAtithmatic{
    public int divi_sum(int n){
        int sum = n;
        for(int i = 1; i<=n/2; i++){
            if(n%i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        MyCalculator calc = new MyCalculator();
        Scanner sc = new Scanner(System.in);
        var ret = calc.divi_sum(sc.nextInt());
        System.out.println(ret);
    }
}
