package backend.api;

import backend.dto.PersonRequest;
import backend.dto.PersonResponse;
import backend.service.PersonService;
import org.springframework.web.bind.annotation.*;

//Denne annotation omformes java til JSON, når det vises i browser
@CrossOrigin
@RestController

@RequestMapping("api/krak")
public class PersonController {

    PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PutMapping("/{id}")
    public PersonResponse updatePerson(@RequestBody PersonRequest body, @PathVariable int id){
        return personService.updatePerson(body,id);
    }
}
