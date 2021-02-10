package library;

class CourseBook extends Book {

    public CourseBook() {
        author = "ABC";
        modifyTemplate();
    }

    public static void main(String[] args) {

        Book courseBook = new CourseBook();
        courseBook.printBook();
        System.out.println(courseBook.author);
    }
}

