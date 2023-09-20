package com.memberboard.board.board.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import com.memberboard.board.board.model.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	//@Autowired
	//private BoardService service;
	
	private Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	// boardlist
	@GetMapping("/list")
	public String boardList(
			@RequestParam(value="cp", required = false, defaultValue = "1") int cp,
			Model model) {
		
		Map<String, Object> map = null;
		
		//map = service.selectBoardList(cp, model);
		
		model.addAttribute("map", map);
		
		logger.info("게시판 목록 페이지");
		
		return "board/boardList";
		
	}
	
	@GetMapping("/write")
	public String boardWirte() {
		
		
		return "board/boardWrite";
	}
	
	@PostMapping("/enroll")
	public String boardEnroll() {
		
		return "redirect:/board/boardList";
	}
}
