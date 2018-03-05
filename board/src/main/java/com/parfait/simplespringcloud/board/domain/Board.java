package com.parfait.simplespringcloud.board.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Board {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String content;

    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public static Board create(@NonNull String title, @NonNull String content) {
        return new Board(title, content);
    }
}
