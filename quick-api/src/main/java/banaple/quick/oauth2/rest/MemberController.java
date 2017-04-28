package banaple.quick.oauth2.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import banaple.quick.oauth2.domain.Member;
import banaple.quick.oauth2.service.RepositoryService;

@RestController
public class MemberController {
	
	@Autowired
	RepositoryService repositoryService;
	
	@RequestMapping(value = "/api/members")
	public List<Member> members() {
		return repositoryService.findAll();
	}
	
	public void test(){
		System.out.println("가나다라");
		
	}
}
