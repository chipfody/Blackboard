package Chapter4;

public class Inheritance {
//    public static class Zoo {
//        public Zoo() {
//            System.out.println("Zoo created");
//            super(); // DOES NOT COMPILE
//            System.out.println("Zoo created");
//        }
//
//    public static class Zoo {
//        public Zoo() {
//            super();
//            System.out.println("Zoo created");
//
//        }
//    }
//
//        public static void main(String[] args) {
//            Zoo zoo = new Zoo();
//
//        }
//    }


//    public static class Primate {
//        public Primate() {
//            System.out.println("Primate");
//        }
//    }
//    public static class Ape extends Primate {
//        public Ape() {
//            System.out.println("Ape");
//        }
//    }
//    public static class Chimpanzee extends Ape {
//        public static void main(String[] args) {
//            new Chimpanzee();
//        }
//    }

//    static class Fish {
//        protected int size;
//        private int age;
//        public Fish(int age) {
//            this.age = age;
//        }
//        public int getAge() {
//            return age;
//        }
//    }
//    public static class Shark extends Fish {
//        private int numberOfFins = 8;
//        public Shark(int age) {
//            super(age);
//            this.size = 4;
//        }
//        public void displaySharkDetails() {
//
//        }
//    }
//
//    public static void main(String[] args) {
//        Shark fish = new Shark(7);
//        System.out.println(fish.getAge());
//        System.out.print("Shark with age: "+ fish.getAge());
//        System.out.print(" and "+ fish.size +" meters long");
//        System.out.print(" with "+ fish.numberOfFins +" fins");
//
//    }

    public static class Marsupial {
        public static boolean isBiped() {
            return false;
        }
        public void getMarsupialDescription() {
            System.out.println("Marsupial walks on two legs: "+isBiped());
        }
    }
    public static class Kangaroo extends Marsupial {
        public static boolean isBiped() {
            return true;
        }
        public void getKangarooDescription() {
            System.out.println("Kangaroo hops on two legs: "+isBiped());
        }
        public static void main(String[] args) {
            Kangaroo joey = new Kangaroo();
            joey.getMarsupialDescription();
            joey.getKangarooDescription();
        }
    }

    public static class Rodent {
        protected int tailLength = 4;
        public void getRodentDetails() {
            System.out.println("[parentTail="+tailLength+"]");
        }
    }
    public static class Mouse extends Rodent {
        protected int tailLength = 8;
        public void getMouseDetails() {
            System.out.println("[tail="+tailLength +",parentTail="+super.tailLength+"]");
        }
        public static void main(String[] args) {
            Mouse mouse = new Mouse();
            mouse.getRodentDetails();
            mouse.getMouseDetails();
        }
    }


}
