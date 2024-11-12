package com.green.board2;

import com.green.board2.model.BoardGetOneRes;
import com.green.board2.model.BoardGetRes;
import com.green.board2.model.BoardPostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper mapper;

    public int postBoard(BoardPostReq p) {
        return mapper.insBoard(p);
    }

    public List<BoardGetRes> getBoardList() {
        return mapper.selBoardList();
    }

    public BoardGetOneRes getBoardOne(int boardId) {
        return mapper.selBoardOne(boardId);
    }
}

