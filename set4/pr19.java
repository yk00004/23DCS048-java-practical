
public class pr19 {

    public static class Rectangle {

        int length, breadth;

        Rectangle(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        void area() {
            System.out.println("Area  : " + length * breadth);
        }

        void perimeters() {
            int pe = length + breadth;
            System.out.println("perimeters : " + 2 * pe);
        }
    }

    public static class square extends Rectangle {

        square(int side) {
            super(side, side);
        }
    }

    public static void main(String[] args) {

        Rectangle[] shapes = new Rectangle[2];
        shapes[0] = new Rectangle(10, 5);
        shapes[1] = new square(7);

        // Rectangle a=new Rectangle(10, 5);
        // Rectangle aa=new square(1);
        shapes[0].area();
        shapes[0].perimeters();
        shapes[1].area();
        shapes[1].perimeters();
    }
}
