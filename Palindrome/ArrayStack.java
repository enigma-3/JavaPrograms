import java.util.Arrays;
import java.util.EmptyStackException;

/**
 *
 * @author gavinnagra
 */
public class ArrayStack<T> implements StackInterface<T> {

    private T[] stack;    // Array of stack entries
    private int topIndex; // Index of top entry
    private boolean initialized = false;
    private static final int DEFAULT_CAPACITY = 50;
    private static final int MAX_CAPACITY = 10000;

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    } // end default constructor

    public ArrayStack(int initialCapacity) {
      //  checkCapacity(initialCapacity);

        // The cast is safe because the new array contains null entries
        @SuppressWarnings("unchecked")
        T[] tempStack = (T[]) new Object[initialCapacity];
        stack = tempStack;
        topIndex = -1;
        initialized = true;
    } // end constructor

//  < Implementations of the stack operations go here. >
//  < Implementations of the private methods go here; checkCapacity and
//    checkInitialization are analogous to those in Chapter 2. >
//  . . .
    public void push(T newEntry) {
       // checkInitialization();
       // ensureCapacity();
        stack[topIndex + 1] = newEntry;
        topIndex++;
    } // end push

   /* private void ensureCapacity() {
        if (topIndex >= stack.length - 1) // If array is full, double its size
        {
            int newLength = 2 * stack.length;
            checkCapacity(newLength);
            stack = Arrays.copyOf(stack, newLength);
        } // end if
    } // end ensureCapacity*/
// Version 4.0

    public T peek() {
       // checkInitialization();
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return stack[topIndex];
        }
    } // end peek
// Version 4.0

    public T pop() {
      //  checkInitialization();
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            T top = stack[topIndex];
            stack[topIndex] = null;
            topIndex--;
            return top;
        } // end if
    } // end pop
// Version 4.0

    public boolean isEmpty() {
        return topIndex < 0;
    } // end isEmpty
// Version 4.0
    // Throws an exception if the client requests a capacity that is too large.

 /*   private void checkCapacity(int capacity) {
        if (capacity > MAX_CAPACITY) {
            throw new IllegalStateException("Attempt to create a bag whose "
                    + "capacity exeeds allowed "
                    + "maximum of " + MAX_CAPACITY);
        }
    } // end checkCapacity*/

    // Doubles the size of the array bag.
    // Precondition: checkInitialization has been called.
    // Throws an exception if receiving object is not initialized.
 /*   private void checkInitialization() {
        if (!initialized) {
            throw new IllegalStateException("Uninitialized object used "
                    + "to call an ArrayBag method.");
        }
    } // end checkInitialization*/

    @Override
    public void clear() {
        topIndex = -1;
    } // end clear

    public boolean palindromeCheck(String test) {
        ArrayStack<Character> palindromeStack = new ArrayStack<Character>();
        for (int i = 0; i < test.length(); i++) {
            palindromeStack.push(test.charAt(i));
            topIndex++;
        }
        
        String palindromeString = "";

        while (!palindromeStack.isEmpty()) {
            palindromeString += palindromeStack.pop();
        }
        System.out.println(palindromeString);

        if (palindromeString.equals(test)){
            System.out.println("It is a palindrome.");
            return palindromeString.equals(test);            
        }       
        else
            System.out.println("It is not a palindrome.");
            return false;
    }
}

