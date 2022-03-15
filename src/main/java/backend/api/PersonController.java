package backend.api;

import backend.dto.PersonResponse;
import backend.service.PersonService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class PersonController {
    PersonService personService;

    @GetMapping
    public List<PersonResponse> getPersons (){
        return personService.getPersons();
    }

    @DeleteMapping("/{email}")
    public void deleteMember(@PathVariable String email) {
        personService.deletePerson(email);
    }

}

