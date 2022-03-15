package backend.service;

import backend.dto.PersonRequest;
import backend.dto.PersonResponse;
import backend.entity.Person;
import backend.error.Client4xxException;
import backend.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public PersonResponse updatePerson (PersonRequest personToEdit, Integer personId){
        Person personUpdated = personRepository.findById(personId).orElseThrow(()-> new Client4xxException("No person with provided ID found" + personId));;
        personUpdated.setEmail(personToEdit.getEmail());
        personUpdated.setFirstName(personToEdit.getFirstName());
        personUpdated.setLastName(personToEdit.getLastName());
        personUpdated.setPhone(personToEdit.getPhone());

        return new PersonResponse(personRepository.save(personUpdated));

    }

}
