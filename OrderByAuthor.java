package assign02;

import java.util.Comparator;

/**
 * This class is a comparator used to sort library books by the
 * Author's surname, and if tied, broken with the book title
 * lexicographically.
 *
 * @author Adan Ibrahim and Haoqing Li
 * @version September 1, 2024
 */

public class OrderByAuthor<Type> implements Comparator<LibraryBookGeneric<Type>> {
    /**
     * define a custom comparison for library books,
     * using author surname (lexicographically) with ties
     * broken by book title (lexicographically).
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(LibraryBookGeneric<Type> o1, LibraryBookGeneric<Type> o2) {
        if(o1.getAuthorSurname().charAt(0) > o2.getAuthorSurname().charAt(0)){
            return 1;
        }
        if(o1.getAuthorSurname().charAt(0) < o2.getAuthorSurname().charAt(0)){
            return -1;
        }
        // If there is a tie, break it by using the book title.
        if(o1.getAuthorSurname().charAt(0) == o2.getAuthorSurname().charAt(0))
        {
            if(o1.getTitle().charAt(0) > o2.getTitle().charAt(0)){
                return 1;
            }
            if(o1.getTitle().charAt(0) < o2.getTitle().charAt(0)){
                return -1;
            }
        }
        return 0;
    }
}
