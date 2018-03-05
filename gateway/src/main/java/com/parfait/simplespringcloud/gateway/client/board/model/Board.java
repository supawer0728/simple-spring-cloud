package com.parfait.simplespringcloud.gateway.client.board.model;

import lombok.Data;

@Data
public class Board {
    private Long id;
    private String title;
    private String content;
}
