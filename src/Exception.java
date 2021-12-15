public class Exception extends Throwable {
    public static void main(String[] args) {
        int sum = 0;
        for (String s: args) {
            try { sum+= Integer.parseInt(s); }
            catch (NumberFormatException n) { System.err.println(s + " not a Valid Integer!"); }
        }
        System.out.println("The Sum of elements is : " + sum);
    }
}
