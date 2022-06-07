package Person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonListTest {
    
    PersonList personList;
    @Test
    void findByName() {

        assertThrows(NullPointerException.class, ()-> personList.findByName("Claudio Lopez"));
    }
}