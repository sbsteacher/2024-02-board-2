package com.green.board2;

import com.green.board2.model.BoardGetOneRes;
import com.green.board2.model.BoardGetRes;
import com.green.board2.model.BoardPostReq;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("board")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService service;

    @PostMapping
    public int postBoard(@RequestBody BoardPostReq p) {
        return service.postBoard(p);
    }

    @GetMapping
    public List<BoardGetRes> getBoardList() {
        return service.getBoardList();
    }

    @GetMapping("{boardId}")
    public BoardGetOneRes getBoardOne(@PathVariable int boardId) {
        return service.getBoardOne(boardId);
    }
}
