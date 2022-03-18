package backend.api;

import backend.entity.Hobby;
import backend.repository.HobbyRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@RequestMapping("api/hobbies")
public class HobbyController {

    HobbyRepo hobbyRepo= new HobbyRepo();

    @GetMapping("/hobbylist")
    public ArrayList<Hobby> allHobbies(){
       return hobbyRepo.getAllHobbies();
    }



    /*public static void main(String[] args) {
        HobbyRepo h = new HobbyRepo();
        System.out.println(h.getAllHobbies());
    }*/


}
