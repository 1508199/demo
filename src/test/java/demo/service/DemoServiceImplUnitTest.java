package demo.service;

import demo.model.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author Vorname Nachname (vorname.nachname@dataphone.at)
 * @since 25.12.2023
 */
public class DemoServiceImplUnitTest {

    private DemoServiceImpl demoService;

    @BeforeEach
    public void setUp() {
        demoService = new DemoServiceImpl();
    }

    @Test
    public void createPersonList() {
        List<Person> personList = demoService.createPersonList();
        assertNotNull(personList);
        assertEquals(3, personList.size());

        // You can add more specific assertions based on your requirements
        assertEquals("Gledion Sala", personList.get(0).getName());
        assertEquals(29, personList.get(0).getAge());
    }
}