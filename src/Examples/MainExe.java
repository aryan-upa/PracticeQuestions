package Examples;

abstract class Marks {
    abstract double getPercentage();
}

class A0 extends Marks{
    int a,b,c;

    A0(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getPercentage() {
        return (double)(a+b+c)/3;
    }
}

class B0 extends Marks{
    int a,b,c,d;

    B0(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    double getPercentage() {
        return (double)(a+b+c+d)/4;
    }
}

public class MainExe{
    public static void main(String[] args) {

    }
}
