/*class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("Write something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}*/
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
    Student(){

    }
    /*Student(String name, int age) {
        this.name = name;
        this.age = age;
    }*/
}
public class OOPSAC {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Vedant";
        s1.age = 24;

        Student s2 = new Student(s1);
        s2.printInfo();
    }
}
//C:\Users\vedan\IdeaProjects\Practice\src\OOPSAC.java