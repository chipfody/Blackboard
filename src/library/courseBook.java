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

class House2  extends Book {
    House2() {
        Book book = new Book();
        String value = book.isbn;
        book.printBook();
        book.author = "JKL"; //-- unlike class House, this code will run b/c it is now in the same package as Book
        book.modifyTemplate(); //-- same as above

        int c = book.issueCount; //-- same as above
        book.issueHistory(); //-- same as above
    }
}