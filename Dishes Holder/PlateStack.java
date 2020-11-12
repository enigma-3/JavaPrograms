/**
 *
 * @author gavinnagra
 */
public class PlateStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Dish dish1 = new Dish("Red", "4 lbs");
        Dish dish2 = new Dish("Blue", "5 lbs");
        Dish dish3 = new Dish("Purple", "6 lbs");
        
        ContainerInterface<Dish> aContainer = new DishContainer<>();
        
        aContainer.add(dish1);
        aContainer.add(dish2);
        aContainer.add(dish3);
        
        aContainer.display();
        System.out.println("Container currently holds: " + 
                aContainer.getCurrentSize() + " items.");
        
        System.out.println("Container is empty?: " + aContainer.isEmpty());
        
        System.out.println("Removing the heavy purple dish.. it is too heavy!\n");
        aContainer.remove(dish3);
        
        System.out.println("Purple 6 lb dish still in container?: " 
        + aContainer.contains(dish3));
        
        System.out.println("\nRemaining dishes: ");
        aContainer.display();
    }
    
}
