package data;

import com.google.gson.Gson;
import entity.Person;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Fen
 */
public class Generator {
    
    private final static String[] FIRSTNAMES = {"Mads", "Christian", "Jesper", "Michael", "Lone", "Sine"};
    private final static String[] LASTNAMES = {"Nielsen", "Jensen", "Olsen", "Fløistrup", "Andersen", "Åberg"};
    
    public static String generate(int sampleAmount, int startIdNumber) {
        ArrayList<Person> persons = new ArrayList();
        Random rand = new Random();
        Gson gson = new Gson();
        int id = startIdNumber;
        for (int i = 0; i < sampleAmount; i++) {
            int fName = rand.nextInt(FIRSTNAMES.length);
            int lName = rand.nextInt(LASTNAMES.length);
            int age = rand.nextInt(54) + 17; // Age has to be between 17 and 70, both inclusive.
            persons.add(new Person(id, FIRSTNAMES[fName],LASTNAMES[lName], age));
            id++;
        }
        
        
        return gson.toJson(persons);
    }
    
    public static void main(String[] args) {
        System.out.println(Generator.generate(100, 1000));
    }
}


