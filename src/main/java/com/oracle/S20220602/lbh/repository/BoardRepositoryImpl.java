package com.oracle.S20220602.lbh.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oracle.S20220602.common.domain.Board;
@Repository
public class BoardRepositoryImpl implements BoardRepository{
	
	@Autowired
	private SqlSession		session;
	
	@Override
	public List<Board> boardSelect(Board board) {
		List<Board> listBoard = null;
		System.out.println("BoardRepositoryImpl boardSelect start...");
		try {
			listBoard = session.selectList("lbhListBoard",board);
			System.out.println("BoardRepositoryImpl boardSelect listBoard.size() -> " + listBoard.size());
		} catch (Exception e) {
			System.out.println("BoardRepositoryImpl boardSelect Exception->"+e.getMessage());
		}
		return listBoard;
	}

	@Override
	public int total() {
		int total = 0;
		System.out.println("BoardRepositoryImpl total start...");
		try {
			total = session.selectOne("lbhBoardCount");
			System.out.println("BoardRepositoryImpl total -> " + total);
		} catch (Exception e) {
			System.out.println("BoardRepositoryImpl total() Exception->"+e.getMessage());
		}
		return total;
	}

	@Override
	public int boardWrite(Board board) {
		int result = 0;
		System.out.println("BoardRepositoryImpl boardWrite Start");
		try {
			result = session.insert("lbhBoardWrite",board);
		}catch (Exception e) {
			System.out.println("BoardRepositoryImpl boardWrite Exception -> " + e.getMessage());
		}
		return result;
	}

	@Override
	public Board boardDetail(int boardno) {
		System.out.println("BoardRepositoryImpl boardDetail Start");
		Board board = null;
		try {
			board = session.selectOne("lbhBoardDetail",boardno);
		}catch (Exception e) {
			System.out.println("BoardRepositoryImpl boardDetail Exception -> " + e.getMessage());
		}
		return board;
	}
}
