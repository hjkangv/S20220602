package com.oracle.S20220602.lbh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.S20220602.common.domain.Board;
import com.oracle.S20220602.lbh.repository.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService{
	
	private final BoardRepository boardRepository;
	@Autowired
	public BoardServiceImpl(BoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}

	@Override
	public List<Board> boardSelect(Board board) {
		System.out.println("BoardServiceImpl listBoard ...");
		List<Board> listBoard = null;
		listBoard = boardRepository.boardSelect(board);
		return listBoard;
	}

	@Override
	public int total() {
		int total = 0;
		System.out.println("BoardServiceImpl total start");
		total = boardRepository.total();
		return total;
	}

	@Override
	public int boardWrite(Board board) {
		int result = 0;
		System.out.println("BoardServiceImpl boardWrite Start");
		result = boardRepository.boardWrite(board);
		return result;
	}

	@Override
	public Board boardDetail(int boardno) {
		System.out.println("BoardServiceImpl boardDetail Start");
		Board board = null;
		board = boardRepository.boardDetail(boardno);
		return board;
	}
}
