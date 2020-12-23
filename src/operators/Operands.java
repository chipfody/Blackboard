package operators;

public class Operands {

    public static void main(String[] args) {
        char char1 = 'a';
        System.out.println(char1);
        System.out.println(char1 + char1);
        System.out.println(char1 - char1);

        final byte age1 = 10;
        final byte age2 = 5;
        short sum = age1 + age2;
        System.out.println("\n" + sum);


        Long long1 = Long.valueOf(123);
        Long long2 = Long.valueOf("123");
        System.out.println(long1 == long2);

        Long long3 = Long.valueOf(456);
        Long long4 = Long.valueOf(456);
        System.out.println(long3 == long4);
        System.out.println(long3.equals(long4));

        Integer int1 = Integer.valueOf(1000);
        Integer int2 = Integer.valueOf(1000);
        System.out.println(int1 == int2);

        char c = 122;
        System.out.println(c);

        int myChar = 97;
        int yourChar = 98;
        System.out.print((char)myChar + (char)yourChar);

        int age = 20;
        System.out.print(" ");
        System.out.print((float) age + "\n");

        System.out.println("\n");
        int num1 = 12;
        float num2 = 17.8f;
        boolean value = true;
        boolean result = (num1 >= 12 && num2 < 4.567) || value == true;
        System.out.println(num2 < 4.567);
        System.out.println(result);


        }

    }

