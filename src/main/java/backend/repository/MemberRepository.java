package backend.repository;

import backend.entity.Member;
import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import org.hibernate.type.IntegerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface MemberRepository extends JpaRepository<Member, Integer> {

}
