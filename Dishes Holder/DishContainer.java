import java.util.*;

/**
 *
 * @author gavinnagra
 */
public class DishContainer<T> implements ContainerInterface<T> {

    private T[] items;
    private int numItems;
    public static final int DEFAULT_MAX_SIZE = 50;

    public DishContainer() {

        items = (T[]) new Object[DEFAULT_MAX_SIZE];

        numItems = 0;

    }

    public DishContainer(int maxSize) {

        if (maxSize <= 0) {
            throw new IllegalArgumentException("maxSize must be > 0");
        }

        items = (T[]) new Object[maxSize];

        numItems = 0;

    }

    public boolean add(T item) {

        if (item == null) {
            throw new IllegalArgumentException("item must be non-null");
        }

        if (numItems == items.length) {
            return false;              // no more room!
        } else {

            items[numItems] = item;

            numItems++;

            return true;

        }

    }

    public boolean remove(T item) {

        for (int i = 0; i < numItems; i++) {

            if (items[i].equals(item)) {

                // Shift the remaining items left by one.
                for (int j = i; j < numItems - 1; j++) {
                    items[j] = items[j + 1];
                }

                items[numItems - 1] = null;

                numItems--;

                return true;

            }

        }

        return false;  // item not found

    }

    public int getCurrentSize() {

        return numItems;

    }

    public boolean isEmpty() {

        if (numItems == 0) {
            return true;
        } else {
            return false;
        }

    }

    public void display() {

        for (int i = 0; i < numItems; i++) {
            System.out.println(items[i].toString());
        }
    }

    public boolean contains(T item) {

        for (int i = 0; i < numItems; i++) {

            if (items[i].equals(item)) {
                return true;
            }

        }
        return false;
    }
    
}
