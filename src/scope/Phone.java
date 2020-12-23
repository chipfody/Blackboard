package scope;

public class Phone {

    String phoneNumber = "123456789";
    void setNumber() {
        String phoneNumber = "987654321";
        System.out.println("void = " + this.phoneNumber);
        System.out.println(phoneNumber);
    }
}
