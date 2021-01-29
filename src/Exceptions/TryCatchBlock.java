package Exceptions;

import java.time.LocalTime;

public class TryCatchBlock {
}
class FallInRiverException extends Exception {}
class RiverRafting {
    void crossRapid(int degree) throws FallInRiverException {
        System.out.println("Cross Rapid");
        if (degree > 10) throw new FallInRiverException();
    }
}
class TestRiverRafting {
    public static void main(String args[]) throws FallInRiverException {
        RiverRafting riverRafting = new RiverRafting();
        riverRafting.crossRapid(19);
    }
}

class FeelingHungryException extends RuntimeException {}

class Trip {
    void goTrekking(LocalTime startTime) {
// compare time now and start time
// throw FeelingHungryException if difference is > 2 hrs
        int hrs = LocalTime.now().getHour() - startTime.getHour();
        if (hrs >= 2) throw new FeelingHungryException();
    }
}
class TestTrip {
    public static void main(String args[]) {
        Trip trip = new Trip();
        trip.goTrekking(LocalTime.of(11,24));
    }
}


class InvalidArrayAccess {
    public static void main(String args[]) {
        String[] students = {"Shreya", "Joseph"};
        try {
            System.out.println(students[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception");
        }
        System.out.println("All seems to be well");
    }
}