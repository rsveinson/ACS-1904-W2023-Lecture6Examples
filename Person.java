/** 
 * ACS-1904 Person example
 *          to see how to implement the Comparable interface
 * @author 
*/

public class Person implements Comparable<Person> {
    private String name;
    private int year; // year of birth
    
    // constructors
    public Person(String n, int y) {
        name = n;
        year = y; 
    }
    
    // concrete implementation of the comparTo() method
    public int compareTo (Person p) {
        // compare the name of this object  
        // to the name of object p
        return name.compareTo(p.name);
    }
    
    /* alternate implementation that compares
     * birth year instead of name
     */
    // public int compareTo(Person p){
        // return this.year - p.getYear();
    // }
    
    // getters and setters
    public String getName(){
        return name;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public int getYear(){
        return year;
    }
    public void setYear(int y){
        year = y;
    }
    
    public String toString(){
        return name;
    }
}
