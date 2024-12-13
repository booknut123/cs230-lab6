import java.util.LinkedList;
import java.util.List;

/**
 * Implements a class to represent and maintain a Student Organization
 * @author CD for CS230x (adapted from SK for CS230), Kailyn, Aadya
 * @version F24
 * 
 * Relationship between ClubStudent and StudentOrganization: aggregation
 */

public class StudentOrganization {
    //instance vars
    private String name; //the name of the organization
    private ClubStudent president; // the president of the org
    private ClubStudent vicePresident; //its vice president
    private List<ClubStudent> members; //contains all the members of the org

    /** constructor
     * Creates an empty Student Organization
     * @param name The name of the organization
     */
    public StudentOrganization(String name) {
        this.name = name;
        this.members = new LinkedList<ClubStudent>();
        this.president = null;
        this.vicePresident = null;
    }
    
    /**
     * Adds a member to the org if the member isn't already there
     * 
     * @param member the ClubStudent to add
     */
    public void addMember(ClubStudent member) {
        if (!isMember(member)) {
            members.add(member);
        }
    }
    
    /**
     * Checks if the given member is already a member of the org
     * @return true if the member is in the org already and false otherwise
     */
    public boolean isMember(ClubStudent member) {
        return this.members.contains(member);
    }
    
    /**
     * @return a String representation of members (and can update when president and VicePresident become applicable)
     */
    public String toString() {
        Object[] tempArray = members.toArray();
        String s = this.name + " ";
        for (int i = 0; i < tempArray.length; i++) {
            s += "\n" + tempArray[i].toString();
        }
        return s;
    }
    
    /**
     * Main method to test this class
     */
    public static void main (String[] args) {
        StudentOrganization thisOrg = new StudentOrganization("Aiko");
        ClubStudent member = new ClubStudent("Verlaine", "v", 2025);
        thisOrg.addMember(member);
        thisOrg.addMember(new ClubStudent("Grace", "g", 2025));
        thisOrg.addMember(member);
        System.out.println(thisOrg.toString());
    }
}
