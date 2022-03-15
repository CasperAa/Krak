package backend.service;

import backend.dto.PersonRequest;
import backend.dto.PersonResponse;
import backend.entity.Person;
import backend.repository.PersonRepository;

public class PersonService {

    PersonRepository personRepository;

    public PersonResponse addPerson(PersonRequest body) throws Exception {

        //Kun, hvis e-mail skal være unik
        if (personRepository.emailExist(body.getEmail())) {
            throw new Exception("Provided email is taken");
        }
        Person personNew = personRepository.save(new Person(body));
        return new PersonResponse(personNew,true,true);
    }

}
