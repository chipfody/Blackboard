package functionalProgramming;

import java.util.ArrayList;

public class Predicates {
    public static void main(String args[]) {
        Emp e1 = new Emp("Shreya", 5, 9999.00);
        Emp e2 = new Emp("Paul", 4, 1234.00);
        Emp e3 = new Emp("Harry", 5, 8769.00);
        Emp e4 = new Emp("Selvan", 1, 2769.00);
        ArrayList<Emp> empArrList = new ArrayList<>();
        empArrList.add(e1);
        empArrList.add(e2);
        empArrList.add(e3);
        empArrList.add(e4);
//        Predicate predicate = e -> e.getPerformanceRating() >= 5;
//        filter(empArrList, predicate);
    }
    static void filter(ArrayList<Emp> list, Predicate rule) {
        for (Emp e : list) {
            if (rule.test(e)) {
                System.out.println(e);
            }
        }
    }
}
class Emp {
    String name;
    int performanceRating;
    double salary;

    Emp(String nm, int rating, double sal) {
        this.name = nm;
        this.performanceRating = rating;
        this.salary = sal;
    }

    public String getName() {
        return name;
    }

    public int getPerformanceRating() {
        return performanceRating;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return name + ":" + performanceRating + ":" + salary;
    }
}

interface Predicate<T> {
    /**
     * Evaluates this predicate on the given argument.
     *
     * @param t the input argument
     * @return {@code true} if the input argument matches the predicate,
     * otherwise {@code false}
     */
    boolean test(T t);

}
