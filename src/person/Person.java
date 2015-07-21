package person;

/**
 * This class represents a person.
 * 
 * @author brianmcveigh
 */
public class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    
    public static final int OLD_AGE = 70;
    
    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
    
    public Person(String firstName, String lastName, String gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }
    
    /**
     * Set the first name for the Person.
     * 
     * @param firstName 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    /**
     * Get the first name for the person.
     * 
     * @return firstName
     */
    public String getFirstName() {
        return this.firstName;
    }
    
    /**
     * Set the last name for the person.
     * 
     * @param lastName 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * Get the last name for the person.
     * 
     * @return lastName
     */
    public String getLastName() {
        return this.lastName;
    }
    
    /**
     * Set the gender for the person.
     * 
     * @param gender 
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    /**
     * Get the person's gender.
     * 
     * @return gender
     */
    public String getGender() {
        return this.gender;
    }
    
    /**
     * Set the person's age.
     * 
     * @param age 
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * Get the person's age.
     * 
     * @return age
     */
    public int getAge() {
        return this.age;
    }
    
    /**
     * Checks to see if the person is old.
     * If they are 70 or older, they are
     * considered to be old.
     * 
     * @return boolean
     */
    public boolean isOld() {
        if (this.age >= OLD_AGE) {
            return true;
        }
        return false;
    }
    
    /**
     * This is the string representation of a Person object.
     * 
     * @return String
     */
    @Override
    public String toString() {
        String output = "";
        
        output += "First Name: " + getFirstName() + "\n";
        output += "Last Name: " + getLastName() + "\n";
        output += "Gender: " + getGender() + "\n";
        output += "Age: " + getAge() + "\n";
        output += "Old?: " + isOld() + "\n";
        
        return output;
    }
}
