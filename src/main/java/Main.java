import Person.Person;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        //Ejercicio 4

        FileWriter fileWriter = new FileWriter("person.txt");

        Person personFile = new Person(5647, "Carlota Perez", 27,"doctora");

        fileWriter.write(personFile.toString());

        fileWriter.close();

        //Ejercicio 1:
        Person person = new Person(46263598, "Rodolfo Rodriguez", -28,"camarero");







    }
}
