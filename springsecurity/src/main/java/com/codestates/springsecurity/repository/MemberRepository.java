package com.codestates.springsecurity.repository;

import com.codestates.springsecurity.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    public Member findByUsername(String username);
}
