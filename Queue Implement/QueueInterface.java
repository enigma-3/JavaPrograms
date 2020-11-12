/**
 *
 * @author gavinnagra
 */
public interface QueueInterface<T> {

    public void enqueue(T newEntry);

    public T showQueue();

    public T getFront();

    public boolean isEmpty();
}
