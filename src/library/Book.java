package library;

public class Book {

    public String isbn;
    protected String author;
    public int issueCount = 12;

    public void printBook() {
        System.out.println("Print Book Method");
    }

    protected void modifyTemplate() {
        System.out.println("Template Modified");
    }

    protected void issueHistory() {}
}

