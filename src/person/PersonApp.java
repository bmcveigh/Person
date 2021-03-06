package person;

import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * @author brianmcveigh
 */
public class PersonApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        implement();
    }

    /**
     * This file contains custom code to create some objects.
     */
    public static void implement() {
        ArrayList<Person> people = new ArrayList<Person>();

        Person person1 = new Person("Bob", "Moore", "male", 26);
        people.add(person1);

        Person person2 = new Person("Jane", "Doe", "female", 75);
        people.add(person2);

        Person person3 = new Person("Robert", "Mondavi", "something", 5);
        people.add(person3);

        String output = "People\n------\n";

        for (int i = 0; i < people.size(); i++) {
            output += people.get(i).toString() + " \n";
        }

        // Print a dialog box message.
        int choice = JOptionPane.showConfirmDialog(null, "Write to file?\n\n" + output, "Select an Option", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            try {
                FileWriter writer = new FileWriter("./test.txt", true);
                writer.write(output);
                writer.flush();
                writer.close();
                System.out.println("File written successfully.");

            } catch (Exception e) {
                System.err.println("Error writing file.");
            }
        }
    }
}
