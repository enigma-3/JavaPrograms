/**
 *
 * @author gavinnagra
 */
public class Main {

    public static void main(String[] args) {
        
        System.out.println("Testing an initially empty bag with the addition of "
                + "5 strings:");
        BagInterface<String> aBag = new ArrayBag<> ();
        String[] contentsOfBag1 = {"A", "B", "B", "C", "D"};
        testAdd(aBag, contentsOfBag1);
        
        System.out.println("\nTesting an initially empty bag that I will fill"
                + " to capacity:");
        aBag = new ArrayBag<>(6);
        String[] contentsOfBag2 = {"A", "B", "B", "C", "D", "A", "otherString"};
        testAdd(aBag, contentsOfBag2);
        
        if(aBag.contains("A") == true)
            System.out.println("\nThis bag contains the string 'A'!");
        else
            System.out.println("\nThis bag does not contain the string 'A'!");
        
        if(aBag.contains("F") == true)
            System.out.println("\nThis bag contains the string 'F'!");
        else
            System.out.println("\nThis bag does not contain the string 'F'!");
                
        
        System.out.println("\nRemoving all instances of the string 'A'..");
        aBag.remove("A");
        aBag.remove("A");
        
        System.out.println("\nThe bag now contains " + aBag.getCurrentSize()
                + " items.");
        
        aBag.display();
        
        System.out.println("\nThe index of the string 'C' is located"
                + " at: " + aBag.getIndexOf("C"));
        
        if(aBag.isEmpty() == true)
            System.out.println("\nThis bag is empty and nothing will "
                    + "be displayed.");
        else
            System.out.println("\nThis bag is not empty.");
        
        System.out.println("\nRemoving all items..");
        aBag.remove("B");
        aBag.remove("B");
        aBag.remove("C");
        aBag.remove("D");
        
        if(aBag.isEmpty() == true)
            System.out.println("\nThis bag is empty and nothing will be "
                    + "displayed.");
        else
            System.out.println("\nThis bag is not empty.");
        
        aBag.display();
        
    }
    
    private static void testAdd(BagInterface<String> aBag, String[] content)
    {
        System.out.print("Adding the following " + content.length +
                 " strings to the bag: ");
        for (int index = 0; index < content.length; index++)
        {
            if (aBag.add(content[index]))
                System.out.print(content[index] + " ");
            else
                System.out.print("\nUnable to add " + content[index] 
                        + " to the bag.");
        }
        System.out.println();
        
        displayBag(aBag);
    }
    
    private static void displayBag(BagInterface<String> aBag)
    {
        System.out.println("The bag contains the following string(s):");
        Object[] bagArray = aBag.toArray();
        for (int index = 0; index < bagArray.length; index++)
        {
            System.out.print(bagArray[index] + " ");
        }
        
        System.out.println();
    }
    
}
