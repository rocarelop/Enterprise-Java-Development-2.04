package Person;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {


    @Test
    void Test_Constructor_Age_Negative(){
        assertThrows(NullPointerException.class, ()-> new Person(46263598, "Rodolfo", -9,"camarero"));

    }

    @Test
    void Test_Clone_Equal_Different_Id(){
        Person person = new Person(8956, "Carlos", 25, "acariciador de damas");
        Person clon = Person.clone(person);

        System.out.println(person.equals(clon));

    }

}