package inhertiance;

public abstract class Animal {
    public abstract String getName();
}
class Bird extends Animal {
    @Override
    public String getName() {
        return null;
    } // DOES NOT COMPILE
}
class Flamingo extends Bird {
    public String getName() {
        return "Flamingo";
    }
}