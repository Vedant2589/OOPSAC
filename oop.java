class Employee {
    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
        //System.out.println("My salary is " + salary);
    }

    public int getsalary(){
        return salary;
    }
}
public class oop {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee vedant = new Employee();
        Employee manasi = new Employee();

        vedant.id = 42;
        vedant.name = "Vedu";
        vedant.salary = 130;

        manasi.id = 13;
        manasi.name = "Manu";
        manasi.salary = 131;
        //System.out.println(vedant.id);
        //System.out.println(vedant.name);
        vedant.printDetails();
        manasi.printDetails();
        int salary = vedant.getsalary();
        //int salary = manasi.getsalary();
        System.out.println(salary);
    }
}
