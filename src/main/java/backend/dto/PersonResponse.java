package backend.dto;


import backend.entity.Person;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor

/*include.non_null betyder at den kun tager værdier med som ikke er nul*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonResponse {
    int id;

    String email;
    String firstName;
    String lastName;
    String phone;

    public PersonResponse(int id, String email, String firstName, String lastName, String phone) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public PersonResponse(Person person/*boolean includeAllInformation*/){
        this.id = person.getId();
        this.email = person.getEmail();
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
        this.phone = person.getPhone();
    }

    /*
     Kommentar: Ved ikke helt om vi vil have en liste af medlemmerne (tænkte til admin), men nu har vi skelet til metoden
    og så kan vi beslutte det senere


    public MemberResponse(String username, LocalDateTime created, List<Role> roleList) {
        this.created= created;
        this.roleNames=roleList.stream().map(role -> role.toString()).collect(Collectors.toList());
        this.username=username;

    }

    public static List<MemberResponse> getMemberEntities (List<Member> members){
        return members.stream().map(member -> new MemberResponse(member,false)).collect(Collectors.toList());
    }*/
}
