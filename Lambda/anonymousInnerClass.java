package Lambda;

import java.util.ArrayList;
import java.util.List;

public class anonymousInnerClass {
public List<Person> filter(List<Person> personList, Filterable filterable){
    List<Person> filteredPersonList = new ArrayList<>();
    for (Person person: personList){
        if(filterable.apply(person)){
            filteredPersonList.add(person);
        }
    }
      return filteredPersonList;
}

}
