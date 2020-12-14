package Chapter4;

public class Order {

    String value = "t";

    {
        value += "a";
    }

    {
        value += "c";
    }

    public Order() {
        value += "b";
    }

    public Order(String s) {
        value += s;
    }

    public static void main(String[] args) {
        Order order = new Order("f");
        System.out.println(order.value);
        order = new Order();
        System.out.println(order.value);
    }


}

