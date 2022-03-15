package backend.service;

import backend.dto.PersonRequest;
import backend.dto.PersonResponse;
import backend.entity.Person;
import backend.error.Client4xxException;
import backend.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    PersonRepository personRepository;

    public PersonService(PersonRepository personRepository)
    {
        this.personRepository = personRepository;
    }

    public PersonResponse addPerson(PersonRequest body) throws Exception {

        //Kun, hvis e-mail skal være unik
        if (personRepository.emailExist(body.getEmail())) {
            throw new Exception("Provided email is taken");
        }
        Person personNew = personRepository.save(new Person(body));
        return new PersonResponse(personNew,true,true);
    }

    //Til denne metode skal der huskes at lave en constructure
    public PersonResponse updatePerson (PersonRequest personToEdit, int personId){
        Person personUpdated = personRepository.findById(personId).orElseThrow(()-> new Client4xxException("No person with provided ID found" + personId));;
        personUpdated.getId();
        personUpdated.setEmail(personToEdit.getEmail());
        personUpdated.setFirstName(personToEdit.getFirstName());
        personUpdated.setLastName(personToEdit.getLastName());
        personUpdated.setPhone(personToEdit.getPhone());

        return new PersonResponse(personRepository.save(personUpdated));
    }

}
