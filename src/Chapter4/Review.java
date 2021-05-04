package Chapter4;

//public class Review {

//    public class RopeSwing {
//        private static final String leftRope;
//        private static final String rightRope;
//        private static final String bench;
//        private static final String name = "name";
//
//        static {
//            leftRope = "left";
//            rightRope = "right";
//        }
//
//        static {
//            name = "name";
//            rightRope = "right";
//        }
//
//        public static void main(String[] args) {
//            bench = "bench";
//        }
//    }


    class Order {

        static String result = "";

        {result += "c";}

        static {
            result += "u"; }

        { result += "r"; }
    }

    class OrderDriver {
        public static void main(String[] args) {
            System.out.print(Order.result + " ");
            System.out.print(Order.result + " ");
            new Order();
            new Order();
            System.out.print(Order.result + " ");
        }
    }

//}
