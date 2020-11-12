/**
 *
 * @author gavinnagra
 */
public interface ContainerInterface<T> {
    
    public int getCurrentSize();

    public boolean isEmpty();

    public boolean add(T newEntry);

    public boolean remove(T anEntry);

    public boolean contains(T item);
    
    public void display();

} 
