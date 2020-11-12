import java.util.Random;

/**
 *
 * @author gavinnagra
 */
public class Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QueueInterface<Integer> queue = new LinkedQueue<>();
        
        for(int i = 0; i < 10; i++)
            queue.enqueue(generateQueue());
        
        for(int a = 0; a < 10; a++)
            System.out.println(queue.showQueue());
        
    }
    
    public static int generateQueue() {
        Random randomNumber = new Random();
        
        int number = randomNumber.nextInt(100) + 1;
        
        return number;   
    }
    
    
}
