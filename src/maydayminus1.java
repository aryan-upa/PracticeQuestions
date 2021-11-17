public class maydayminus1 {
    abstract class Shape{
        public abstract float printArea(int x, int y);
    }

    class Rectangle extends Shape{
        @Override public float printArea(int x, int y){
            return x*y;
        }
    }

    class Triangle extends Shape{
        @Override public float printArea(int x, int y){
            return (float) (x*y)/2;
        }
    }

    class Circle extends Shape{
        @Override public float printArea(int x, int y){
            return (float) (3.14*x*x);
        }
    }
}
