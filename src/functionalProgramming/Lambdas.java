package functionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;


public class Lambdas {

    public static void main(String[] args) {
        ArrayList <Integer> al1 = new ArrayList();
        al1.add(1);
        al1.add(2);
        al1.add(3);
        ArrayList <Integer> al2 = new ArrayList();
        al2.add(4);
        al2.add(5);
        al2.add(6);
        al1.addAll(al2);
        System.out.println(al1);

        ArrayList <Integer> cloneAL = new ArrayList<>();
        cloneAL = (ArrayList)al1.clone();

        System.out.println(cloneAL);
        System.out.println(al1.equals(cloneAL));

        al1.remove(2);
        al1.remove(new Integer(5));

        System.out.println(al1);
        System.out.println(cloneAL);

        System.out.println(al1.equals(cloneAL));
        al1.add(null);

        System.out.println(al1);

        String [] isNull = new String[4];
        for (String x : isNull) System.out.println(x);

    }
}

class ParkRanger {
    int birds = 10;

    public static void main(String[] data) {
        int trees = 5;
        ParkRanger p = new ParkRanger();
        System.out.print(trees + p.birds);
    }
}

class Keyboard {
    private boolean numLock = true;
    static boolean capLock = false;
    public static void main(String... shortcuts) {
        Keyboard kb = new Keyboard();
        System.out.print(kb.numLock+" "+capLock);
    }
}

