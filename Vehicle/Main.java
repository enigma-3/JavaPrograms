/**
 *
 * @author gavinnagra
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Car car1 = new Car("Red", 2010, 9000.97, "BMW", "M4");
        Car car2 = new Car("Black", 2011, 8000.97, "Lexus", "is250");
        Truck truck1 = new Truck("Blue", 2014, 10400.97, "Ford", "F150");
        Truck truck2 = new Truck("Pink", 2016, 12500.97, "Dodge", "Ram");
        
        car1.display();
        car2.display();
        
        System.out.print(car1.getBrand() + " is ");
        car1.start();  
        System.out.print(car1.getBrand() + " is ");
        car1.accelerate();
        System.out.print(car1.getBrand() + " is ");
        car1.decelerate();
        System.out.print(car1.getBrand() + " is ");
        car1.stop();
        System.out.println();
        
        System.out.print(car2.getBrand() + " is ");
        car2.start();
        System.out.print(car2.getBrand() + " is ");
        car2.accelerate();
        System.out.print(car2.getBrand() + " is ");
        car2.decelerate();
        System.out.print(car2.getBrand() + " is ");
        car2.stop();
        
      if(car1.isMoreExpensive(car2) == 1) {
          System.out.println("\n" + car1.getBrand() + " is more expensive!\n");
      }
      else if(car2.isMoreExpensive(car1) == 1)
          System.out.println("\n" + car2.getBrand() + " is more expensive!\n");
      else
          System.out.println("They are both equal in price.\n");
      
        truck1.display();
        truck2.display();
        
        System.out.print(truck1.getBrand() + " is ");
        truck1.start();  
        System.out.print(truck1.getBrand() + " is ");
        truck1.accelerate();
        System.out.print(truck1.getBrand() + " is ");
        truck1.decelerate();
        System.out.print(truck1.getBrand() + " is ");
        truck1.stop();
        System.out.println();
        
        System.out.print(truck2.getBrand() + " is ");
        truck2.start();
        System.out.print(truck2.getBrand() + " is ");
        truck2.accelerate();
        System.out.print(truck2.getBrand() + " is ");
        truck2.decelerate();
        System.out.print(truck2.getBrand() + " is ");
        truck2.stop();
      
      if(truck1.isMoreExpensive(truck2) == 1) {
          System.out.println("\n" + truck1.getBrand() + " is more expensive!");
      }
      else if(truck2.isMoreExpensive(truck1) == 1)
          System.out.println("\n" + truck2.getBrand() + " is more expensive!");
      else
          System.out.println("They are both equal in price.");
      
    }
    
}
    
