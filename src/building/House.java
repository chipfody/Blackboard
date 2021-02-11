package building;

import library.Book;

public class House  extends Book{
    House() {
        Book book = new Book();
        String value = book.isbn;
        book.printBook();
//        book.author = "JKL"; -- won't compile b/c author has protected access in Book
//        book.modifyTemplate(); -- won't compile b/c modifyTemplate() has protected access in Book
//
//        int c = book.issueCount; -- int issueCount is not public in library.Book. Cannot be accessed from outside package
//        book.issueHistory(); -- issueHistory() is not public in library.Book. Cannot be accessed from outside package
    }

    public static void main(String[] args) {  // the commented code above will not run as is noted, but by extending Book in House, the code below is available
        House house = new House();
        house.author = "Dante";
        house.modifyTemplate();
        int c = house.issueCount;
    }
}