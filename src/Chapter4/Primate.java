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


