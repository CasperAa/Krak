package backend.entity;

import backend.dto.MemberRequest;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//With these annotation for getter, setter & ToString, no need to code for these functions.
@Getter
@Setter
@ToString
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String email;
    String firstName;
    String lastName;
    String phone;


  /* @ManyToOne
    Address personalAdress;
    */

    public Member(){}

    public Member(String email, String firstName, String lastName, String phone) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public Member(MemberRequest body){
        this(body.getEmail(), body.getFirstName(), body.getLastName(), body.getPhone());
    }

    /*skelet til, når person skal connectes til adress

    @ManyToOne(mappedBy = "")
    private Set<Address> AddressList = new HashSet<>();
    */



}
