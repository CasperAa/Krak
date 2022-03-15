package backend.service;

import backend.dto.PersonRequest;
import backend.dto.PersonResponse;
import backend.entity.Person;
import backend.repository.PersonRepository;

import java.util.List;

public class PersonService {

    PersonRepository personRepository;


    public PersonService(PersonRepository personRepository) {
        this.personRepository=personRepository;
    }


    public PersonResponse addPerson(PersonRequest body) throws Exception {

        //Kun, hvis e-mail skal være unik
        if (personRepository.emailExist(body.getEmail())) {
            throw new Exception("Provided email is taken");
        }
        Person personNew = personRepository.save(new Person(body));
        return new PersonResponse(personNew,true,true);
    }

    public List<PersonResponse> getPersons(){
        List<Person> persons = personRepository.findAll();
        return  PersonResponse.getPersonEntities(persons);
    }

    public void deletePerson(String email){ personRepository.deleteById(email);
    }

}


