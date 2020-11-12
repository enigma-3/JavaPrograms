/**
 *
 * @author gavinnagra
 */
public abstract class Automobile {
    String color;
    int year;
    double price;
    
    abstract void accelerate();
    abstract void decelerate();
    
    void start() {
        System.out.println("Starting..");
    }
    
    void stop() {
        System.out.println("Stopping..");
    }
}
