package com.board.persistence;

import java.util.List;

import com.board.domain.BoardVO;
import com.board.domain.Criteria;


public interface BoardMapper {

	public List<BoardVO> getListWithPaging(Criteria cri); 
}
