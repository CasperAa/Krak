package backend.service;

import backend.entity.Person;
import backend.repository.PersonRepository;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class PersonServiceTest {
    @Autowired
    static PersonRepository personRepository;
    static PersonService personService;

    static int person1Id, person2Id;


    /*@Test
    public void updatePerson() throws Exception {
        PersonRequest personToEdit= new PersonRequest("alice@kk.dk", "alice", "Jensen", "+4599389004");
    }*/
}