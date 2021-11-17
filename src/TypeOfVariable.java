public class TypeOfVariable {
    static int a;
    int b;
    private static int c;

    TypeOfVariable(){
        System.out.println("Constructor of TypeOfVariable");
    }

    static class xyz{
        //here xyz is static class of the Abc class, hence accessible by the class name.
        void display(){
            System.out.println(a);
            //System.out.println(b); cannot print this as static class can only access static variables of the parent class.
            System.out.println(c);
        }

        xyz(){
            System.out.println("Constructor of xyz");
        }
    }

    public static void main(String[] args) {
        TypeOfVariable.xyz b = new TypeOfVariable.xyz();
        //accessing inner class using parent class name.
        b.display();
    }
}

class Abc{
    static int a;
    int b;
    private int c;

    Abc(){
        System.out.println("Const. of Abc");
    }
    class pqr{
        //non-static inner class, member of every object formed of the parent class.
        static void display(){
            System.out.println("Display 1 function");
            // as this function is static, it can only access the static variables of the parent and this class.
            System.out.println(a);
//            System.out.println(b);
//            System.out.println(c);
        }

        int q;
        void display2(){
            System.out.println("Display 2 function");
            // non-static method can access instance variables as well.
            System.out.println(q);
        }

        void display3(){
            System.out.println("Display 3 function");
            //non-static method can access instance and static variables of the parent class as well.
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }

        pqr(){
            System.out.println("Const. of pqr");
        }
    }

    public static void main(String[] args) {
        Abc.pqr q = (new Abc()).new pqr();
        // we can also write like this, so we do not have to create the object of Abc class explicitly, but now that object is un-accessible, as it is anonymous.
        Abc.pqr.display();
        q.q = 999;
        q.display2();
        q.display3();
    }
}
