public class Arithmatic {
    int add (int[] a){
        var sum = 0;
        for (int var : a) {
            sum+=var;
        }
        return sum;
    }
}

class Adder extends Arithmatic {
    int callAdd(int...a){
        return super.add(a);
    }

}

class Exe{
    public static void main(String[] args) {
        Adder obj = new Adder();
        System.out.println(obj.callAdd(2,5,1,2,3,6,5,8,4));
    }
}
