package com.parfait.simplespringcloud.member.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/members", collectionResourceRel = "members")
public interface MemberRepository extends JpaRepository<Member, Long> {
}
