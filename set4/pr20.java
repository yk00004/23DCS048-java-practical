
public class pr20 {

    public static class Shape {

        void printshape() {
            System.out.println("this is this is shape");
        }
    }

    public static class rectangle extends Shape {

        void printrectangle() {
            System.out.println("this is rectangular shape");
        }

    }

    public static class circle extends Shape {

        void printcircle() {
            System.out.println("this is circular shape");
        }
    }

    public static class square extends rectangle {

        void printsquare() {
            System.out.println("Square is a rectangle");
        }
    }

    public static void main(String[] args) {
        square s = new square();
        s.printshape();
        s.printrectangle();
    }
}
