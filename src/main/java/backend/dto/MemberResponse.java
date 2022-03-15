package backend.dto;

import backend.entity.Member;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MemberResponse {
    int id;
    String email;
    String firstName;
    String lastName;
    String phone;

    public MemberResponse(Member member, boolean includeId, boolean includeContactInfo) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        if(includeId){
            this.id = id;
        }
        if(includeContactInfo){
            this.phone = phone;
            this.email = email;
        }
    }

}
