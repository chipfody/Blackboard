package polymorphism;

class PolymorphismWithClasses {
    public static void main(String[] args) {
        Programmer emp1 = new Programmer();
        Manager emp2 = new Manager();

        System.out.println();

        emp1.reachOffice();
        emp2.reachOffice();

        System.out.println();

        emp1.startProjectWork();

        System.out.println();

        emp2.startProjectWork();
    }
}
