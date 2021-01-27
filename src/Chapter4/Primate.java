package Chapter4;

public class Primate {
    public boolean hasHair() {
        return true;
    }
}

interface HasTail {
    public boolean isTailStriped();
}
class Lemur extends Primate implements HasTail {
    public boolean isTailStriped() {
        return false;
    }
    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
//        HasTail hasTail = lemur;
//        System.out.println(hasTail.isTailStriped());
//        Primate primate = lemur;
//        System.out.println(primate.hasHair());

//        HasTail hasTail = lemur;
//        System.out.println(((Lemur) hasTail).age);

        Primate primate = lemur;
        System.out.println(((Lemur) primate).isTailStriped());
    }
}

class Bird {}

class Fish extends Bird {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Bird bird = (Bird)fish; // DOES NOT COMPILE
    }
}

class Primate2 {
    public Primate2() {
        System.out.println("Primate");
    }
}
class Ape extends Primate2 {
    public Ape() {
        System.out.println("Ape");
    }
}
class Chimpanzee extends Ape {
    public static void main(String[] args) {
        new Chimpanzee();
    }
}

class Fish2 {
    protected int size;
    private int age;
    public Fish2(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
class Shark extends Fish2 {
    private int numberOfFins = 8;
    public Shark(int age) {
        super(age);
        this.size = 4;
    }
    public void displaySharkDetails() {
        System.out.print("Shark with age: "+getAge());
        System.out.print(" and "+super.size+" meters long");
        System.out.print(" with "+numberOfFins+" fins");
    }

    public static void main(String[] args) {
        Shark shark = new Shark(3);
        shark.displaySharkDetails();
    }
}

class Canine {
    String color = "Brown";
    public double getAverageWeight() {
        return 50;
    }
}
class Wolf extends Canine {
    String color = "Gray";
    public double getAverageWeight() {
        return super.getAverageWeight()+20;
    }
    public static void main(String[] args) {
        Canine canine = new Wolf();
        System.out.println(new Canine().getAverageWeight());  // 50.0
        System.out.println(new Wolf().getAverageWeight());  // 70.0
        System.out.println(canine.color);  //Brown
        System.out.println(((Wolf)canine).color);  //Gray
    }
}

class Marsupial {
    public static boolean isBiped() {
        return false;
    }
    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: "+isBiped());
    }
}
class Kangaroo extends Marsupial {
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


