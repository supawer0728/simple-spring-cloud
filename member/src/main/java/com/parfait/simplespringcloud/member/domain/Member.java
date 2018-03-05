package com.parfait.simplespringcloud.member.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Member {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Grade grade;

    private Member(String name, Grade grade) {
        this.name = name;
        this.grade = grade;
    }

    public static Member create(@NonNull String name, @NonNull Grade grade) {
        return new Member(name, grade);
    }
}
