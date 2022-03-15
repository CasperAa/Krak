package backend.repository;

import backend.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepository extends JpaRepository<Person, Integer> {

    @Query("select (count(m) > 0) from Person m where m.email = :email")
    boolean emailExist(String email);

}
