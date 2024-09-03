package assign02;

import java.util.GregorianCalendar;

/**
 * This class represents a library book that contains info on the book
 * and the patron information and book due date.
 *
 * @author Adan Ibrahim and Haoqing Li
 * @version August 31, 2024
 */
public class LibraryBookGeneric<Type> extends Book {
    private Type patronID;
    private GregorianCalendar dueDate;
    /**
     * Creates a book from the given ISBN, author, and title.
     *
     * @param isbn            - unique id for this book
     * @param authorSurname   - last name for this book's author
     * @param authorOtherName - rest of name for this book's author
     * @param title           - title for this book
     */
    public LibraryBookGeneric(long isbn, String authorSurname, String authorOtherName, String title) {
        super(isbn, authorSurname, authorOtherName, title);
        this.patronID = null;
        this.dueDate = null;
    }

    /**
     * Grabs the Patron's ID number that relates to the book that is checked out.
     *
     * @return Patron's ID number.
     */
    public Type getPatron(){
        return this.patronID;
    }

    /**
     * Gets the due date of the book that is currently checked out.
     *
     * @return Library book's due date.
     */
    public GregorianCalendar getDueDate(){
        return this.dueDate;
    }

    /**
     * Returns the book checked out by the Patron.
     * Sets the Patron to -1 and the due date to null.
     */
    public void checkInBook(){
        this.patronID = null;
        this.dueDate = null;
    }

    /**
     * Assigns the library book that is being checked out to a Patron
     * and sets a due date for the book.
     * @param patron
     * @param dueDate
     */
    public void checkOutBook(Type patron, GregorianCalendar dueDate){
        this.patronID = patron;
        this.dueDate = dueDate;
    }
}
