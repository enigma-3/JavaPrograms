/**
 *
 * @author gavinnagra
 */
public interface BagInterface<T> {

    public int getCurrentSize();

    public boolean isEmpty();

    public boolean add(T newEntry);

    public boolean remove(T anEntry);

    public boolean contains(T anEntry);

    public T[] toArray();

    public void display();
    
    public void checkInitialization();
    
    public int getIndexOf(T anEntry);
    
    public boolean isArrayFull();
    
    public void doubleCapacity();
    
    public void checkCapacity(int capacity);

}
