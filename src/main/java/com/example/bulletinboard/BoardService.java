package com.example.bulletinboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    // get boards data
    public List<Board> getAllBoard() {
        return boardRepository.findAll();
    }

}
