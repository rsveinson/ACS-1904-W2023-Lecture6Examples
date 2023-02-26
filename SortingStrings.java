import java.util.Arrays;
/**
 * Sort an array of strings using Arrays.sort
 */
public class SortingStrings
{
   public static void main(String[] args){
       String [] names = {"Joe", "Linda", "Peter", "Mary", "Lee"};
       
       //  print the unsorted list of names
       System.out.println("Unsorted:");
       for (String n: names)
          System.out.print(n+" ");
       
       // call the sort method from the Arrays class
       Arrays.sort(names);
       
       // print the sorted list of names
       System.out.println("\nSorted:");
       for (String n: names)
           System.out.print(n+" ");
    }
}
