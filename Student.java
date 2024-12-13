/**
 * Create a student for managing organizations
 * @author CD for CS230x (adapted from SK for CS230), Kailyn, Aadya
 * @version F24
 */

public class Student implements Comparable<Student>{
  
  protected String name;  //To hold the name  (first and last name) of the student
  protected String address; // the student's home address
  protected String userName; // the student's email address
  protected int year; //graduation year
  
  
  public Student(String name, String usrName, int y) {
    this.name = name;
    this.userName = usrName;
    this.year = y;
    this.address = "unavailable";
  }
  
  public Student(String name, String addr, String usrName, int y) {
    this(name, usrName, y); //notice the use of the construtor above!
    this.address = addr;
  }
  
  public void setAddress (String addr) {
    this.address = addr;
  }
  
  /**
   * getName()
   * @return Returns the name of the Student
   */ 
  public String getName() {
    return name;
  }
  
  /**
   * getUsername()
   * @return Returns the user name of the Student
   */
  public String getUserName() {
    return userName;
  }
  
  public String getAddress() {
    return address;
  }
  
  /**
   * getGradYear()
   * @return Returns the year of the Student
   */
  public int getGradYear() {
    return year;
  }
  
  @Override
  public String toString() {
    String j = (address.equals("unavailable")) ? "" : (" address: " + address);
    return  "   " + name +" (" + userName + ")"  + j +  " "+ year;
  }
  
  /**
   * @return true if student's username = other student's username (practically if they are the same student)
   */
  @Override
  public boolean equals(Object other) {
    return this.userName.equals(((Student)other).userName);
  }
  
  /**
   * @return ASCII comparison of the two student's names
   */
  @Override
  public int compareTo(Student other) {
    return this.name.compareTo(other.name);
  }
  
  /**
   * Main method to test this class
   */
  public static void main (String[] args) {
      Student student1 = new Student("Ann", "a1", 2028);
      Student student2 = new Student("Kay", "k1", 2028);
      System.out.println(student1.compareTo(student2));
      System.out.println(student1.equals(student2));
      student2 = new Student("Ann", "a2", 2026);
      System.out.println(student1.equals(student2));
      System.out.println(student1.equals(student1));
  }
}