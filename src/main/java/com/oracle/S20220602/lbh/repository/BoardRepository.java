package com.oracle.S20220602.lbh.repository;

import java.util.List;

import com.oracle.S20220602.common.domain.Board;

public interface BoardRepository {
	List<Board> boardSelect(Board board);
	int total();
	int boardWrite(Board board);
	Board boardDetail(int boardno);
}
