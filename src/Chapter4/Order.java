package Chapter4;

class Order2 {

    String value = "t";

    {
        value += "a";
    }

    {
        value += "c";
    }

    public Order2() {
        value += "b";
    }

    public Order2(String s) {
        value += s;
    }

    public static void main(String[] args) {
        Order2 order = new Order2("f");
        System.out.println(order.value);
        order = new Order2();
        System.out.println(order.value);
    }


}

