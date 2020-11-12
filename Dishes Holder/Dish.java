/**
 *
 * @author gavinnagra
 */
public class Dish {
    
    String color;
    String weight;
    
    Dish() {}
    
    Dish(String color, String weight) {
        this.color = color;
        this.weight = weight;
    }
    
    void setColor(String color) {
        this.color = color;
    }
    
    void setWeight(String weight) {
        this.weight = weight;
    }
    
    String getColor() {
        return this.color;
    }
    
    String getWeight() {
        return this.weight;
    }
    
    @Override
    public String toString() {
        return "Color: " + this.color + "\nWeight: " + this.weight + "\n";
    }
}