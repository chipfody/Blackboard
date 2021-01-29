package Chapter4;

public class ChapterReview {
}

class Mammal {
public Mammal(int age) {
    System.out.print("Mammal");
    }
}
class Platypus extends Mammal {

    public Platypus(int age) {
        super(age);
        System.out.print("Platypus");
    }

    public static void main(String[] args) {
        new Platypus(5);
    }
}

interface Nocturnal {
    default boolean isBlind() {
        return true;
    }
}

class Owl implements Nocturnal {
    public boolean isBlind() {
        return false;
    }

    public static void main(String[] args) {
        Nocturnal nocturnal = (Nocturnal) new Owl();
        System.out.println(nocturnal.isBlind());
    }
}



interface CanHop {}
class Frog implements CanHop {
    public static void main(String[] args) {
        Frog frog = new TurtleFrog();
    }
}
class BrazilianHornedFrog extends Frog {}
class TurtleFrog extends Frog {}


abstract class Bird3 {
    protected void fly() {
        System.out.println("Bird is flying");
    }

    public static void main(String[] args) {
        Bird3 bird = new Pelican();
        bird.fly();
    }
}

class Pelican extends Bird3 {
    protected void fly() {
        System.out.println("Pelican is flying");
    }
}