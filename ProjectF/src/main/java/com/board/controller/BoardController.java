package com.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board.domain.Criteria;
import com.board.service.BoardService;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/board/*")
@Log4j
public class BoardController {
	
	@Autowired
	private BoardService service; 
	
	@GetMapping("list")
	public void list(Model model,Criteria cri) {
		log.info("자유게시판");
		
		model.addAttribute("list",service.getListWithPaging(cri));
		
		
		log.info("김영준천재2");
	}

}
