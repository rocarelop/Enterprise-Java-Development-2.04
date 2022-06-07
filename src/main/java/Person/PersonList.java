package Person;

import java.util.ArrayList;
import java.util.List;

public class PersonList {

   private List<Person> personList = new ArrayList<Person>();

   public PersonList(List personList) {
      this.personList = personList;
   }

   public List getPersonList() {
      return personList;
   }

   public void setPersonList(List personList) {
      this.personList = personList;
   }

   public Person findByName(String name) {

      String firstName= name.split(" ")[0];
      String lastName= null;

      if (name.split(" ").length == 2) {
        lastName = name.split(" ")[1];
      }
      Person personaCoincidente= null;
      for(Person persona: personList){
         if(persona.getName()== name){
            personaCoincidente = persona;
         }else {
            throw new NullPointerException("El name del parámetro no coincide con el parámetro name del objeto");
         }
      }
      return personaCoincidente ;

   }
}
