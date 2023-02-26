/**
 * Specific strings are compared using the 
 * compareto method of the String class
 */
public class StringCompareto
{
    public static void main(String[] args){
        /* String implements Comparable so
         * st instanceof Camparable is true
         * st "is a" comparable
         */
        String st = "blah blah blah";
        if(st instanceof Comparable)
            System.out.println("Comparable");
        
        /* ascii 3 = 51, ascii 4 = 52
         * 51 - 52 = -1
         */
        System.out.println("123".compareTo("124"));
        //*******************************
        
        /* ascii 4 = 52, ascii A = 65
         * 52 - 65 = -13
         */
        System.out.println("124".compareTo("12A"));
        //*******************************
        
        /* ascii 1 = 49, ascii P = 80
         * 49 - 80 = -31
         */
        System.out.println("124".compareTo("PROGRAM"));
        //*******************************
        
        /* ascii P = 80, ascii p = 112
         * 80 - 112 = -32
         */
        System.out.println("PROGRAM".compareTo("program"));
        //*******************************
        
        /* in this example the character by character comparison
         * does not find any difference so the lengths are use to 
         * compare the two strings
         * "programming".length() = 11, "program".length() = 7
         * 11 - 7 = 4
         */
        System.out.println("programming".compareTo("program"));
        
        System.out.println("prog".compareTo("prog"));
    }
}
