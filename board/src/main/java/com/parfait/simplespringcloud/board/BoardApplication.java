package com.parfait.simplespringcloud.board;

import com.parfait.simplespringcloud.board.domain.Board;
import com.parfait.simplespringcloud.board.domain.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BoardApplication implements CommandLineRunner {

    @Autowired
    private BoardRepository boardRepository;

    public static void main(String[] args) {
        SpringApplication.run(BoardApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        boardRepository.save(Board.create("title1", "lorem ipsum1"));
        boardRepository.save(Board.create("title2", "lorem ipsum2"));
        boardRepository.save(Board.create("title3", "lorem ipsum3"));
    }
}
