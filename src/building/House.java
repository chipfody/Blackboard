package building;

import library.Book;

public class House {
    House() {
        Book book = new Book();
        String value = book.isbn;
        book.printBook();
//        book.author = "JKL"; -- won't compile b/c author has protected access in Book
//        book.modifyTemplate(); -- won't compile b/c modifyTemplate() has protected access in Book

//        int c = book.issueCount; -- int issueCount is not public in library.Book. Cannot be accessed from outside package
//        book.issueHistory(); -- issueHistory() is not public in library.Book. Cannot be accessed from outside package
    }

}
