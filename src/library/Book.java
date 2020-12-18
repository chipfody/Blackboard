package library;

public class Book {
    public String isbn;
    protected String author;
    int issueCount;
    public void printBook() {
        System.out.println("Print Book Method");
    }
    protected void modifyTemplate() {
        System.out.println("Template Modified");
    }
    void issueHistory() {

    }
}

