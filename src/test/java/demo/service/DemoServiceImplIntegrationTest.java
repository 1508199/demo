package demo.service;

import demo.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author Vorname Nachname (vorname.nachname@dataphone.at)
 * @since 25.12.2023
 */
@SpringBootTest
public class DemoServiceImplIntegrationTest {

    @Autowired
    private DemoService demoService;

    @Test
    public void testCreatePersonList() {
        List<Person> personList = demoService.createPersonList();

        assertNotNull(personList);
        assertEquals(3, personList.size());

        // Add assertions based on the expected data in your integration environment
    }
}