package inhertiance;

//public class Employee {

    interface Interviewer {
        int MIN_SAL = 9999;
        default void submitInterviewStatus() {
            System.out.println(this);
            System.out.println(this.MIN_SAL);
            System.out.println(this.print());
        }
        String print();
    }
    class Manager implements Interviewer {
        public String print() {
            return("I am " + this);
        }
    }
    class Foo {
        public static void main(String rags[]) {
            Interviewer m = new Manager();
            m.submitInterviewStatus();
        }
    }
//}

class Employee {
    String name;
}
class Programmer extends Employee {
    String name;
    void setNames() {
        this.name = "Programmer";
        super.name = "Employee";
    }
    void printNames() {
        System.out.println(super.name);
        System.out.println(this.name);
    }
}
class UsingThisAndSuper {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.setNames();
        programmer.printNames();
    }
}
