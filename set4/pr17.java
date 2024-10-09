class parent{
    int a=1,b=2;
    public void pprint(){
        System.out.println("this is perent class ");
    }
}
class child extends parent{
    int c=3,d=4;
    public void cprint(){
        System.out.println("this is child class");
    }
}
public class pr17 {
    public static void main(String[] args) {
        parent a=new parent();
        child aa=new child();
        a.pprint();
        aa.pprint();
    }
}
