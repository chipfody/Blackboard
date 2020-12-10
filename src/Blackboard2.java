public class Blackboard2 {


        private String name = "Torchie";
        { System.out.println(name); }
        private static int COUNT = 0;
        static { System.out.println(COUNT); }
        static { COUNT += 10; System.out.println(COUNT); }

        public Blackboard2()
        {
            System.out.println("constructor");
        }
    }

    class CallBlackboard2 {
        public static void main(String[] args) {

            Blackboard2 init = new Blackboard2();
        }
    }

class YetMoreInitializationOrder {
    static {
        add(2);
    }

    static void add(int num) {
        System.out.print(num + " ");
    }

    YetMoreInitializationOrder() {
        add(5);
    }

    static {
        add(4);
    }

    {
        add(6);
    }

    static {
        new YetMoreInitializationOrder();
    }

    {
        add(8);
    }

    public static void main(String[] args) {
    }

    public static class Static {
        private static String name = "Static class";
        public static void first() { }
        public static void second() { }
        public static void third() { System.out.println(name); }
        public static void main(String args[]) {
            first();
            second();
            third(); // DOES NOT COMPILE
        } }
}




