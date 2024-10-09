
import java.util.Scanner;

class Member {

    String name, address;
    int age, salary;
    double pn;

    Scanner sc = new Scanner(System.in);

    public void getinfo() {

        System.out.print("Enter name :");
        name = sc.nextLine();
        System.out.print("Enter age :");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Phone number :");
        pn = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Address :");
        address = sc.nextLine(); 
        System.out.print("Enter salary :");
        salary = sc.nextInt();
    }

    public void printSalary() {
        System.out.println("salary :" + salary);
    }

    public  void print() {
        System.out.println("name :" + name);
        System.out.println("age  :" + age);
        System.out.println("phone number  :" + pn);
        System.out.println("address  :" + address);
        printSalary();

    }

}

class Employee extends Member {

    String speci;
    // Scanner sc = new Scanner(System.in);
    public void getemployee() {
        System.out.println("=====EMPLOYEE=====");
        getinfo();
        sc.nextLine();
        System.out.print("Enter specialization :");
        speci = sc.nextLine();
        
    }
    public void printemp(){
        System.out.println("=====EMPLOYEE=====");
        print();
        System.out.println("specialization :"+speci);
    }
}

class Manager extends Member {
    
    String depart;
    
    public void getmanager() {
        System.out.println("=====MANAGER=====");
        getinfo();
        sc.nextLine();
        System.out.print("Enter department :");
        depart = sc.nextLine();
    }
    public void printmanager(){
        System.out.println("=====MANAGER=====");
        print();
        System.out.println("department :"+depart);
    }

}

public class pr18 {

    public static void main(String[] args) {
        Manager m=new Manager();
        Employee e=new Employee();
        // e.getemp();
        e.getemployee();
        e.printemp();
        m.getmanager();
        m.printmanager();


    }
}
