import java.util.Arrays;

/** 
 * ACS-1904 Person example driver code
 *          see how the concrete implementation of the
 *          comareTo() method in Person works
 * @author 
*/
public class SortingPersons
{
   public static void main(String[] args){
       // and array of type Person i.e. a bunch of Person objects
       Person [] people = {
           new Person("Sam",1972), 
           new Person("Linda", 1974), 
           new Person ("Mary", 1957)};
           
       // unsorted list should call the toString() method
       // on the Person objects
       System.out.println("Unsorted:");
       for (Person p: people)
          System.out.print(p+" ");
          
       // sort the list list
       Arrays.sort(people);
       
       
       System.out.println("\n\nSorted by name:");
       for (Person p: people)
          System.out.print(p+" ");
    }
}
