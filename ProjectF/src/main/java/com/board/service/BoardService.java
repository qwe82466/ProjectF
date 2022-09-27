package com.board.service;

import java.util.List;

import com.board.domain.BoardVO;
import com.board.domain.Criteria;



public interface BoardService {

	//게시글 전체조회 +페이징처리
	public List<BoardVO> getListWithPaging(Criteria cri); 
	
}
