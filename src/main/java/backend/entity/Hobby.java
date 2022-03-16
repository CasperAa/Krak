package backend.entity;

import backend.dto.HobbyRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor

public class Hobby {
    @Id
    private String name;

    private String link;
    private String category;
    private String inOut;

   /* @OneToMany
    HobbyInfo hobbyInfo;*/

    public Hobby(String name, String link, String category, String inOut) {
        this.name = name;
        this.link = link;
        this.category = category;
        this.inOut = inOut;
    }

    public Hobby(HobbyRequest body){
        this.name = body.getName();
        this.link = body.getLink();
        this.category = body.getCategory();
        this.inOut = body.getInOut();
    }

}
