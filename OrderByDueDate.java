package assign02;

import java.util.Comparator;

/**
 * This class is a comparator used to sort library books by the
 * Due Date with no regards to ties.
 *
 * @author Adan Ibrahim and Haoqing Li
 * @version September 1, 2024
 */

public class OrderByDueDate<Type> implements Comparator<LibraryBookGeneric<Type>> {
    /**
     * Defines a custom comparison for library books,
     * using due dates (earlier dates come before later dates)
     * with no regard to possible ties.
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(LibraryBookGeneric<Type> o1, LibraryBookGeneric<Type> o2) {
        if(o1.getDueDate().compareTo(o2.getDueDate()) > 0){
            return 1;
        }
        if(o1.getDueDate().compareTo(o2.getDueDate()) < 0){
            return -1;
        }
        return 0;
    }
}
