package com.example.bulletinboard;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bulletinboard.Board;

public interface BoardRepository extends JpaRepository<Board, Integer> {

    List<Board> findAll();
}
