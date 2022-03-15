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

    public void makePMembers(){
        Member m1 = memberRepository.save(new Member("amanda@amanda.dk", "Amanda", "Amandasen", "70121416"));
        Member m2 = memberRepository.save(new Member("casper@casper.co.uk", "Casper", "Caspersen", "88888888"));

        System.out.println("########################################################################################");
        System.out.println("########################################################################################");
        System.out.println("#################################### WARNING ! #########################################");
        System.out.println("## This part breaks a fundamental security rule -> NEVER ship code with default users ##");
        System.out.println("########################################################################################");
        System.out.println("########################  REMOVE BEFORE DEPLOYMENT  ####################################");
        System.out.println("########################################################################################");
        System.out.println("########################################################################################");
        System.out.println("Created TEST Users");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        makePMembers();

    }
}

