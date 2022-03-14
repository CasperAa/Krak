package backend.dto;


import backend.entity.Member;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

/*include.non_null betyder at den kun tager værdier med som ikke er nul*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MemberResponse {
    int id;

    String email;
    String firstName;
    String lastName;
    String phone;

    public MemberResponse(int id, String email, String firstName, String lastName, String phone) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public MemberResponse(Member member/*boolean includeAllInformation*/){
        this.id = member.getId();
        this.email = member.getEmail();
        this.firstName = member.getFirstName();
        this.lastName = member.getLastName();
        this.phone = member.getPhone();
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
