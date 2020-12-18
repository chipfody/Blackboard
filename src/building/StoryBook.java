package building;

import library.Book;

public class StoryBook extends Book {

    public StoryBook() {
        author = "GHI";
        modifyTemplate();
        //int c = issueCount; -- int issueCount is not public in library.Book. Cannot be accessed from outside package
        //issueHistory(); -- issueHistory() is not public in library.Book. Cannot be accessed from outside package
    }
}
