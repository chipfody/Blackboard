package scope;

public class Course {
    void enroll (long duration) {
        System.out.println("long");
    }
    void enroll (int duration) {
        System.out.println("int");
    }
    void enroll (String s) {
        System.out.println("String");
    }
    void enroll (Object o) {
        System.out.println("Object");
    }
}

class EJavaGuru{
    public static void main(String[] args) {
        Course course = new Course();
        char c = 10;
        course.enroll(c);
        course.enroll("Object");
    }
}
