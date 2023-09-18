package com.memberboard.board.board.model.service;

import java.util.Map;

import org.springframework.ui.Model;

public interface BoardService {

	Map<String, Object> selectBoardList(int cp, Model model);

}
