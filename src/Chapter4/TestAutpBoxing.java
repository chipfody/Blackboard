package Chapter4;

public class TestAutpBoxing {


    public void print(byte x) {
        System.out.print("byte");
    }

    public void print(short x) {
        System.out.print("short");
    }

    public void print(int x) {
        System.out.print("int");
    }

    public void print(boolean x) {
        System.out.print("boolean");
    }

    public void print(float x) {
        System.out.print("float");
    }

    public void print(Object x) {
        System.out.print("Object");
    }

    public static void main(String[] args) {
        TestAutpBoxing t = new TestAutpBoxing();
        short s = 123;
        t.print(s);
        t.print(true);
        t.print(6.789);
    }
}


