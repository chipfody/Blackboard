package functionalProgramming;

class Base {
    String var = "EJava";
    void printVar() {
        System.out.println(var);
    }
}
class Derived extends Base {
    String var = "Guru";
    void printVar() {
        System.out.println(var);
    }
}
class QReference {
    public static void main(String[] args) {
        Base base = new Base();
        Base derived = new Derived();
        Derived derived2 = new Derived();
        System.out.println(base.var);
        System.out.println(derived.var);
        System.out.println(derived2.var);
        base.printVar();
        derived.printVar();
        derived2.printVar();
    }
}

