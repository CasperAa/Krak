package backend.configuration;

import backend.entity.Member;
import backend.repository.MemberRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Controller
@Profile("!test")
public class MakeTestData implements ApplicationRunner {

    MemberRepository memberRepository;

    public MakeTestData(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void makeMembers(){
        Member m1 = memberRepository.save(new Member("amanda@amanda.dk", "Amanda", "Amandasen", "70121416"));
        Member m2 = memberRepository.save(new Member("casper@casper.co.uk", "Casper", "Caspersen", "88888888"));
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        makeMembers();

    }
}

