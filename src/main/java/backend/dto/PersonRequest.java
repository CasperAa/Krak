package backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//TODO Andrea's kommentar: Jeg ved ikke hvad disse to args-connotationer gør???
@NoArgsConstructor
@AllArgsConstructor

public class PersonRequest {

    private int id;
    private String email;
    private String firstName;
    private String lastName;
    private String phone;


}
