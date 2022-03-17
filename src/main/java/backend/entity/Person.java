package backend.entity;

import backend.dto.PersonRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    private String email;
            //@Column(length = 320)


    String firstName;

    String lastName;

    @Column(length = 20)
    String phone;

    @ManyToOne
    Address connectedAddress;


    public Person(PersonRequest body) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public Person(String email, String firstName, String lastName, String phone) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }
}

