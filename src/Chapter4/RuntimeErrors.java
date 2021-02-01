package Chapter4;

import java.util.ArrayList;
import java.util.Arrays;

public class RuntimeErrors {
}

class ThrowNullPointerException {
    static ArrayList<String> list = null;
    public static void main(String[] args) {
        list.add("1");
    }
}

class ThrowNullPointerException2 {
    ArrayList<String> list;
    public static void main(String[] args) {
        ThrowNullPointerException obj = new ThrowNullPointerException();
        obj.list.add("1");
    }
}

class ThrowNullPointerException3 {
    static ArrayList<String> list;

    public static void main(String[] args) {
        if (list != null)
            list.add("1");
    }
}

class TwistInTaleNullPointerException {
    public static void main(String[] args) {
        String[][] oldLaptops = { {"Dell", "Toshiba", "Vaio"}, null,
                {"IBM"}, new String[10] };
        System.out.println(oldLaptops[0][0]); // line 1
        System.out.println(oldLaptops[1]); // line 2
        System.out.println(oldLaptops[3][6]); // line 3
        System.out.println(oldLaptops[3][0].length()); // line 4
        System.out.println(oldLaptops); // line 5
    }
}

class ThrowArithmeticEx {
    public static void main(String args[]) {
        int a = 10;
        int y = a++;
        System.out.println("y = " + y);
        int z = y--;
        System.out.println("z = " + z);
        System.out.println("a is now " + a);
        System.out.println("y is now " + y);

        int x1 = a - 2*y - z;
        System.out.println("X1 = " + x1);
        System.out.println("a = " + a + " y = " + y + " z = " + z);
        int x2 = a - 11;
        System.out.println("X2 = " + x2);
        int x = x1/ x2;
        System.out.println(x);
    }
}

class DivideByZeroPointZero {
    public static void main(String args[]) {
        int a = 10;
        int y = a++;
        int z = y--;
        int x1 = a - 2*y - z;
        int x2 = a - 11;
        double x3 = x2;
        double x = x1/ x3;
        System.out.println(x);
        System.out.println(x1);
        System.out.println(x3);
    }
}

class ThrowNumberFormatException {
    public static int convertToNum(String val) {
        int num = 0;
        try {
            num = Integer.parseInt(val, 16);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(val +
                    " cannot be converted to hexadecimal number");
        }
        return num;
    }
    public static void main(String args[]) {
        System.out.println(convertToNum("16b"));
        System.out.println(convertToNum("65v"));
    }
}


class EJava {
    void method() {
        try {
            guru();
            return;
        } finally {
            System.out.println("finally 1");
        }
    }
    void guru() {
        System.out.println("guru");
        throw new StackOverflowError();
    }
    public static void main(String args[]) {
        EJava var = new EJava();
        var.method();
    }
}

class Quest5 {
    public static void main(String args[]) {
        int arr[] = new int[5];
        arr = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(arr));
        //System.out.println(arr[4]);
        int x = arr[1]-- + arr[0]-- /(arr[0] * arr[4]);
        System.out.println(x);
    }
}

class TryFinally {
    int tryAgain() {
        int a = 10;
        try {
            System.out.println("our first a = " + a);
            ++a;
            System.out.println("a is now = " + a);
        } finally {
            System.out.println("coming into finally a = " + a);
            a++;
            System.out.println("finally a = " + a);
        }
        return a;
    }
    public static void main(String args[]) {
        System.out.println(new TryFinally().tryAgain());
    }
}

class EJavaBase {
    void myMethod() throws ExceptionInInitializerError {
        System.out.println("Base");
    }
}
class EJavaDerived extends EJavaBase {
    void myMethod() throws RuntimeException {
        System.out.println("Derived");
    }
}
class EJava3 {
    public static void main(String args[]) {
        EJavaBase obj = new EJavaDerived();
        obj.myMethod();
    }
}