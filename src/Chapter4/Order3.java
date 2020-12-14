package Chapter4;

public class Order3 {

        final String value1 = "1";
        static String value2 = "2";
        String value3 = "3";
        {
            value3 = "f";
        }
        static {
            value2 = "h";
        }
    }

