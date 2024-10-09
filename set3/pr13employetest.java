
import java.util.Scanner;

class Employee {

    private String fn;
    private String ln;
    private double salary;
    Scanner s = new Scanner(System.in);

    Employee() {
    }
    
    Employee(String fn, String ln, double salary) {
        this.fn = fn;
        this.ln = ln;
        this.salary = salary;
    }

    public void setfn() {
        System.out.print("Enter employee first name :");
        fn = s.next();
    }

    public void setln() {
        System.out.print("Enter employee last name :");
        ln = s.next();
    }

    public void setsalary() {
        System.out.print("Enter employee salary :");
        salary = s.nextDouble();
        if(salary<0){
            salary=0;
        }
        else{
        salary=(salary*12)+(salary*12)*0.1;
        }   
    
    }

    public String getfn() {
        return fn;
    }

    public String getln() {
        return ln;
    }

    public double getsalary() {
        return salary;
    }


}

public class pr13employetest {

    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.setfn();
        e1.setln();
        e1.setsalary();
        e2.setfn();
        e2.setln();
        e2.setsalary();

        System.out.print(e1.getfn()+" ");
        System.out.println(e1.getln());
        System.out.println(e1.getsalary());
        
        System.out.print(e2.getfn()+" ");
        System.out.println(e2.getln());
        System.out.println(e2.getsalary());
        
    }
}
