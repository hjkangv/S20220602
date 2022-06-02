package com.oracle.S20220602.lbh.service;

import java.util.List;

import com.oracle.S20220602.common.domain.Board;

public interface BoardService {
	List<Board> boardSelect(Board board);
	int total();
	int boardWrite(Board board);
	Board boardDetail(int boardno);
}
