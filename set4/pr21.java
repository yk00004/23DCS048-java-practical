public class pr21 {
    public static class Degree{
        void getdegree(){
            System.out.println("I got degree");
        }
    }
    public static class undergraduate extends Degree{
        @Override
        void getdegree(){
            System.out.println("I am an Undergraduate");
        }
    }
    public static class postgraduate extends Degree{
        @Override
        void getdegree(){
            System.out.println("I am an Postgraduate");
        }

    }
    public static void main(String[] args) {
        Degree d=new Degree();
        undergraduate u=new undergraduate();
        postgraduate p=new postgraduate();
        d.getdegree();
        u.getdegree();
        p.getdegree();
    }
}
