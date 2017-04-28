package banaple.quick.oauth2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import banaple.quick.oauth2.domain.Member;
import banaple.quick.oauth2.repository.MemberRepository;

@Service
public class RepositoryService {

	@Autowired
	private MemberRepository mr;
	
	public void saveMember() {

        Member tomas = new Member("Tomas");
        Member jane = new Member("Jane");
        Member ria = new Member("Ria");

        mr.save(tomas);
        mr.save(jane);
        mr.save(ria);
    }

    public List<Member> findAll() {
        return mr.findAll();
    }


}
