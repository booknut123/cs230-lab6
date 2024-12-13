[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pKX2-2we)
# CS230X-lab0-F24
# Student Organizations with Java's Linked Lists

This is a partner lab, [please find your partner here](https://docs.google.com/spreadsheets/d/15ctGjhdPOmH5WX3ggrdF_RKCYon0m3N4LUeT1m9Dz6Y/edit?gid=0#gid=0).

### Goals:
 Gaining experience with:
 * Java's List Interface
 * Using Java's LinkedList 
 * Managing lists of Objects

## Student Organizations at Wellesley College

Student Organizations at Wellesley College are clubs, created and managed entirely by students, with the purpose of enhancing the Wellesley Community. Students are encouraged to participate in these clubs.
Students can also create new Student Organizations if they feel they are needed to cover some interest.  

A Student Organization has a **president**, may (or may not) have a **vice-president**, and has regular **members**.
All Organization members need to be current Wellesley students. 
Once a student has graduated, they cannot be a member any more.

Let's say that there are currently less than 365 student organizations at Wellesley College. Let's create a program that would keep track of members in them.

Every node in a Student Organization member collection will contain an object of type **ClubStudent**. 
Linked Lists offer themselves as a suitable type of data structure in this application, since the number of members in a student organization is not known in advance, and also this number will grow and shrink over the organization's lifetime.

For this lab we will use Java's official [LinkedLists](https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html) class and [List interface](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/List.html) to represent the collection of members in Student Organizations.


### Task 1A: Student.java
We are providing you with two classes, named **Student** and **ClubStudent**. 

First, notice that the **Student** class implements the Java **Comparable** Interface. Pay particular attention to the **equals()** and **compareTo()** method definitions. 
According to these definitions what does it mean for a Student instance to be **greater** (or smaller) than another one? 
What does it mean for two such instances to be **equal**? 

* Write a javadoc comment above the method(s) to explain what you observe. 

* Write a main() method to familiarize yourself with the class and verify that it works as you expect.


### Task 1B: ClubStudent.java

Now, take a closer look at the **ClubStudent** class. What *properties and methods* does a ClubStudent instance *inherit* from its parent? What are the relevant characteristics of a **ClubStudent**, that have been added onto the **Student** data? What about relevant behaviors? 

* Write a javadoc comment above the methods to explain what you observe in each case. 

* Write a main() method to familiarize yourself with the class and verify that it works as you expect.

### Task 2: StudentOrganization.java, using Java's LinkedList

Now open the **StudentOrganization** class. There are several pieces missing from this class, and you need to define them and use them in the main. 

For the purposes of this application, we are only interested in keeping track of the organization's `name`, the collection of its `members`, the `president` and the `vice-president` of an organization.

**Question**: What is the relationship between the two classes: ClubStudent and StudentOrganization? Write the answer in the header of the file.

Start your StudentOrganization class implementation.

  1.  Review the **instance variables**
    * an instance variable of type List, named **members**, to hold objects of type ClubStudent
    * instance variables to hold the **name** of the Organization, its **president** and **vice-president**

  2. Review the 1-parameter **constructor** that takes the name of the Organization as its only input.
    It is used to just create an Organization without members, president or vice president.

  3. Notice the instantiation of the object referenced by **members**, what type of object is this? 

  4. Implement a **main()** to test this constructor, even at this early point. You do not expect much to happen yet, but at least you should not see any "abnormal" behaviors.
 
  5. Write the missing **instance methods** including:

  * **addMember()** to add a member to the organization. Does it need an input argument? What type? How should this method behave if the object specified to be added to the organization is already there?
Remember that since you are using Java's List interface and LinkedList
 implementation, its API can have lots of useful methods already defined for you to use!

  * **isMember()** a predicate method to report whether the input student is a member of the organization or not: if the input student belongs in the organization, the method returns true, otherwise it returns false.

At this point you are in a position to do some **comprehensive testing** of all your code so far. Add a few members to your clubs and test that they are printed correctly.

## SAVING YOUR WORK ON GITHUB
As we have discussed in class, it is important to work on labs and assignments regularly and save frequently. You should test your work incrementally, which will require you to save your file before compiling/running it. In addition to saving your work on your local machine, you should also frequently push your work to this Github repository. You can refer to Lab0 and the [Git and Github tutorial](https://github.com/CS230X-F24/github-starter-course) for a refresher on using these tools. 

## SUBMITTING TO GRADESCOPE
Turn in your work submitting files Student.java, ClubStudent.java, and StudentOrganization.java to your Gradescope account for Lab6. You will receive full credit for this lab if you submit a reasonable attempt at completing the lab by the deadline. You can submit one for your team (only one partner submits) or each team member can submit a copy, just make sure to add your partner in your file's javadoc header. [Click here for Gradescope instructions.](https://docs.google.com/document/d/1zGAJrbdAhfPZVlyDP9N3MmdKXWvNo7rQqehKNM5Q0_M/edit) 

## AUTOGRADER
When you submit your lab to Gradecope, you will immediately see some feedback through the autograder. You are welcome to resubmit as many times as you wish until the deadline. The autograder will check for accuracy, style, and documentation. Make sure there are no remaining `TODO` comments in your submission code. Click here for 230X instructions on: [testing your code](https://docs.google.com/document/d/19cKOyolT8UtSfMNrVw8MGgVWS-lYgHpBs8g2Cf_8Vvc/edit#heading=h.rt39ohf1jp6s), [styling your code](https://docs.google.com/document/d/14uwj9HAjNKfFBm0ZjUpWR7jdqKSj13rudIEJaG74mPk/edit), and [documenting your code](https://docs.google.com/document/d/15uqs_NH8y2sAuLLpiZuSxlI0UsL6a8CHuWY_qcvF4B4/edit). 

## LAB SOLUTIONS
Lab solutions will be added to this repository after the lab deadline. 
