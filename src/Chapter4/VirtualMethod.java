package Chapter4;

class Bird2 {
    String color = "blue";
    public String getName() {
        return "Unknown";
    }
    public void displayInformation() {
        System.out.println("The bird name is: "+getName());
    }
}
class Peacock extends Bird2 {
    String color = "Rainbow";
    public String getName() {
        return "Peacock";
    }
    public static void main(String[] args) {
        Bird2 bird = new Peacock();
        System.out.println("The bird's color is " + bird.color);
        bird.displayInformation();
    }
}

class Reptile {
    public String getName() {
        return "Reptile";
    }
}
class Alligator extends Reptile {
    public String getName() {
        return "Alligator";
    }
}
class Crocodile extends Reptile {
    public String getName() {
        return "Crocodile";
    }
}
class ZooWorker {
    public static void feed(Reptile reptile) {
        System.out.println("Feeding:  "+reptile.getName());
    }
    public static void main(String[] args) {
        feed(new Alligator());
        feed(new Crocodile());
        feed(new Reptile());
    }
}

class Animal {
    public String getName() {
        return "Animal";
    }
}
class Gorilla extends Animal {
    public String getName() { // DOES NOT COMPILE
        return "Gorilla";
    }
}
class ZooKeeper {
    public static void main(String[] args) {
        Animal animal = new Gorilla();
        System.out.println(animal.getName());
    }
}
