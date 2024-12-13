/**
 * Implements a class to represent a ClubStudent as a member to a Student Organization
 * @author CD for CS230x (adapted from SK for CS230), Kailyn, Aadya
 * @version F24
 */

public class ClubStudent extends Student {
    // instance variables

    private int yearJoined;     // the year the student joined the club
    private boolean feePaid; //whether or not the student has paid their participation fees

    /** constructor
     * Given the student's name, username, graduation year, and year the student joined the club,
     * it creates a Student object
     * 
     * Inherits name, userName, and year; adds yearJoined
     * 
     * @param name  The first and last name of the student
     * @param userName The distinct Wellesley user name for the student
     * @param year The year the student is graduating (like 2009)
     * @param yearJoined The year the student joined the club
     */ 
    public ClubStudent (String name, String userName, int gradYear, int yearJoined) {
        super(name, userName, gradYear);
        this.yearJoined = yearJoined;
        feePaid = false;
    }

    /** constructor
     * Given the student's name, username and graduation year
     * it creates a Student object
     * The year the student joined the club is set to -1, to indicate it is not available
     * 
     * Inherits name, userName, and year; adds nothing but sets yearJoined to -1
     * 
     * @param name  The first and last name of the student
     * @param userName The distinct Wellesley user name for the student
     * @param year The year the student is graduating (like 2009)
     */
    public ClubStudent (String name, String userName, int gradYear) {
        this(name, userName, gradYear, -1);
    }

    /**
     * Sets the feePaid to true;
     * Not inherited
     * */
    public void payFee(){
        feePaid = true;
    }

    // instance methods for accessing the instance variables

    /**
     * getFeesPaid()
     * 
     * Not inherited
     * 
     * @return Returns true iff this student has paid their membership fees
     */
    public boolean getFeePaid() {
        return feePaid;
    }

    /** returns a String with all the information in a single Student instance
     * 
     * Inherit toString; add yearJoined info
     * 
     * @return A string representation of a Student object
     */
    public String toString () {
        String j = (yearJoined == -1) ? "" : (" member since " + yearJoined + "\n");
        return super.toString() + j;
    }

    /**
     * ClubStudent also inherits all other Student methods, including getters, compareTo(), equals(), etc.
     */
    
    /**
     * Main method to test this class
     */
    public static void main (String[] args) {
        ClubStudent student1 = new ClubStudent("Ann", "a1", 2028, 2024);
        ClubStudent student2 = new ClubStudent("Kay", "k1", 2028);
        System.out.println(student1.compareTo(student2));
        System.out.println(student1.equals(student1));
        System.out.println(student1);
        System.out.println(student2);
    }
}

