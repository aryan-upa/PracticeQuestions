package Examples;

public class AbsImp {
    public static void main(String[] args) {
        var d = new C();
        d.fun1();
        d.fun2();
    }
}

interface A {
    int a = 10;
    int b = 20;
    abstract void fun1();
}

interface B {
    int c = 20;
    abstract void fun2();
}

class C implements A,B{
    public void fun1(){
        System.out.println("Fun1");
    }
    public void fun2(){
        System.out.println("Fun2");
    }
}
