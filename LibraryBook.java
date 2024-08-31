package assign02;

import java.util.GregorianCalendar;

public class LibraryBook extends Book {
    public int patronID = 0;
    /**
     * Creates a book from the given ISBN, author, and title.
     *
     * @param isbn            - unique id for this book
     * @param authorSurname   - last name for this book's author
     * @param authorOtherName - rest of name for this book's author
     * @param title           - title for this book
     */
    public LibraryBook(long isbn, String authorSurname, String authorOtherName, String title) {
        super(isbn, authorSurname, authorOtherName, title);
    }

    /**
     * Grabs the Patron's ID number that relates to the book that is checked out.
     *
     * @return Patron's ID number.
     */
    public int getPatron(){
        return 0;
    }

    /**
     * Gets the due date of the book that is currently checked out.
     *
     * @return Library book's due date.
     */
    public GregorianCalendar getDueDate(){
        return null;
    }


}
