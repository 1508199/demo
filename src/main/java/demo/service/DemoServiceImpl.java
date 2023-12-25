package demo.service;

import demo.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vorname Nachname (vorname.nachname@dataphone.at)
 * @since 25.12.2023
 */
@Service
public class DemoServiceImpl implements DemoService{

    @Override
    public List<Person> createPersonList(){
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person("Gledion Sala", 29));
        personArrayList.add(new Person("Gledion1 Sala1", 30));
        personArrayList.add(new Person("Gledion2 Sala2", 31));
        return personArrayList;
    }
}
