package com.parfait.simplespringcloud.member;

import com.parfait.simplespringcloud.member.domain.Grade;
import com.parfait.simplespringcloud.member.domain.Member;
import com.parfait.simplespringcloud.member.domain.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MemberApplication implements CommandLineRunner {

    @Autowired
    private MemberRepository memberRepository;

    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        memberRepository.save(Member.create("a", Grade.BRONZE));
        memberRepository.save(Member.create("b", Grade.SILVER));
        memberRepository.save(Member.create("c", Grade.GOLD));
    }
}
