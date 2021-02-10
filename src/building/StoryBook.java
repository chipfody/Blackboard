package building;

import library.Book;

public class StoryBook extends Book {

    public StoryBook() {
        author = "GHI";
        modifyTemplate();
        int c = issueCount; //-- if issueCount is not public or protected in library.Book, it cannot be accessed from outside package
        issueHistory(); //-- if issueHistory() was not public or protected in library.Book, it cannot be accessed from outside package
    }
}
