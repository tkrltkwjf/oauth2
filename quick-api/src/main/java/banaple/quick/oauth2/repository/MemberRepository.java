package banaple.quick.oauth2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import banaple.quick.oauth2.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {}
