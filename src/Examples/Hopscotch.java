package Examples;

import java.util.Scanner;

public class Hopscotch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ln = sc.nextLine();
        String[] arr = ln.split(" ");
        int[] ar = new int[arr.length];
        int i = 0;
        for ( String var: arr) {
            ar[i] = Integer.parseInt(var);
            i++;
        }
        for(int ind = 0; ind<ar.length ; ) {
            ind += ar[ind];
            if(ind == ar.length){
                System.out.println("True");
            }

        }
    }
}
