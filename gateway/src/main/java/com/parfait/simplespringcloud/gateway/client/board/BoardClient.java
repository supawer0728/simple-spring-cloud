package com.parfait.simplespringcloud.gateway.client.board;

import com.parfait.simplespringcloud.gateway.client.board.model.Board;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "board-api")
public interface BoardClient {

    @GetMapping("/boards/{id}")
    Board get(@PathVariable("id") Long id);
}
