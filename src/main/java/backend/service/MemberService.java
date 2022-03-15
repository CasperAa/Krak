package backend.service;

import backend.dto.MemberRequest;
import backend.dto.MemberResponse;
import backend.entity.Member;
import backend.repository.MemberRepository;

public class MemberService {

    MemberRepository memberRepository;

    public MemberResponse addMember(MemberRequest body) throws Exception {

        //Kun, hvis e-mail skal være unik
        if (memberRepository.emailExist(body.getEmail())) {
            throw new Exception("Provided email is taken");
        }
        Member memberNew = memberRepository.save(new Member(body));
        return new MemberResponse(memberNew,true,true);
    }

}
