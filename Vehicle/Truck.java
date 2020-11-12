/**
 *
 * @author gavinnagra
 */
public class Truck extends Automobile implements Comparable{
    String brand;
    String model;
    
    Truck(){}
    
    Truck(String color, int year, double price, String brand, String model) {
        this.color = color;
        this.year = year;
        this.price = price;
        this.brand = brand;
        this.model = model;
    }
    
    void setColor(String color) {
        this.color = color;
    }
    
    void setYear(int year) {
        this.year = year;
    }
        
    void setPrice(double price) {
        this.price = price;
    }
            
    void setBrand(String brand) {
        this.brand = brand;
    }
    
    void setModel(String model) {
        this.model = model;
    }
    
    String getColor() {
        return this.color;
    }
    
    int getYear() {
        return this.year;
    }
    
    double getPrice() {
        return this.price;
    }
    
    String getBrand() {
        return this.brand;
    }
    
    String getModel() {
        return this.model;
    }

    @Override
    void accelerate() {
        System.out.println("Accelerating..");
    }

    @Override
    void decelerate() {
        System.out.println("Decelerating..");
    }
    
    @Override
    public int isMoreExpensive(Comparable other) {
        Truck otherTruck = (Truck)other;
         if (this.getPrice() < otherTruck.getPrice())
            return -1;           
        else if (this.getPrice() > otherTruck.getPrice())
            return 1;            
        else
            return 0;
    }
        
    public void display() {
        System.out.println("Color: " + this.getColor() + "\nYear: " + 
                    this.getYear() + "\nPrice: " + this.getPrice() + "\nBrand: "
                    + this.getBrand() + "\nModel: " + this.getModel() + "\n");
    }
    
}