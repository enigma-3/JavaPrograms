import java.util.*;

/**
 *
 * @author gavinnagra
 */
public class ArrayBag<T> implements BagInterface<T> {

    private T[] items;
    private int numItems;
    public static final int DEFAULT_MAX_SIZE = 50;
    private boolean initialized = false;

    public ArrayBag() {

        items = (T[]) new Object[DEFAULT_MAX_SIZE];

        numItems = 0;

    }

    public ArrayBag(int maxSize) {

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

    public boolean contains(T item) {

        for (int i = 0; i < numItems; i++) {

            if (items[i].equals(item)) {
                return true;
            }

        }

        return false;

    }

    public int getCurrentSize() {

        return numItems;

    }

    public T[] toArray() {

        Object[] copy = new Object[numItems];

        for (int i = 0; i < numItems; i++) {
            copy[i] = items[i];
        }

        return (T[]) copy;

    }

    public boolean isEmpty() {

        if(numItems == 0) {
            return true;
        } else {
            return false;
        }

    }

    public void display() {

        for (int i = 0; i < numItems; i++) {
            System.out.println("i= " + i + "  " + items[i].toString());
        }
        

    }
    
    public void checkCapacity(int capacity)
    {
         if (capacity > DEFAULT_MAX_SIZE)
         throw new IllegalStateException("Attempt to create a bag whose capacity"
                 + " exceeds " + "allowed maximum of " + DEFAULT_MAX_SIZE);
    }
    
    public void checkInitialization()
   {
      if (!initialized)
         throw new SecurityException ("ArrayBag is not initialized properly");
   }
    
    public void doubleCapacity()
	{
      int newLength = 2 * items.length;
      checkCapacity(newLength);
      items = Arrays.copyOf(items, newLength);
	}
    
    public boolean isArrayFull()
	{
		return numItems >= items.length;
	}

    public int getIndexOf(T anEntry)
	{
		int where = -1;
		boolean found = false;
		int index = 0;
      
      while (!found && (index < numItems))
		{
			if (anEntry.equals(items[index]))
			{
				found = true;
				where = index;
			} 
         index++;
		} 
      
		return where;
	}
}
