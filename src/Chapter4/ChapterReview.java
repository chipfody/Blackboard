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


interface CanHop {}
class Frog implements CanHop {
    public static void main(String[] args) {
        Frog frog = new TurtleFrog();
    }
}
class BrazilianHornedFrog extends Frog {}
class TurtleFrog extends Frog {}