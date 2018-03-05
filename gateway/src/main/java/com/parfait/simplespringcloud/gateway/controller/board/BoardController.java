package com.parfait.simplespringcloud.gateway.controller.board;

import com.parfait.simplespringcloud.gateway.client.board.BoardClient;
import com.parfait.simplespringcloud.gateway.client.board.model.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boards")
public class BoardController {

    private final BoardClient client;

    @Autowired
    public BoardController(BoardClient client) {
        this.client = client;
    }

    @GetMapping("/{id}")
    public Board get(@PathVariable Long id) {
        return client.get(id);
    }
}
