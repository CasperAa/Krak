package backend.api;

import backend.entity.Hobby;
import backend.repository.HobbyRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

public class HobbyController {

    public static void main(String[] args) {
        HobbyRepo h = new HobbyRepo();
        System.out.println(h.getAllHobbies().toString());
    }


}
