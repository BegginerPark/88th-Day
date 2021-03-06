package com.rubypaper.persistence;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.rubypaper.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long>{
	List<Board> findByTitle(String searchKeyword);
	List<Board> findByContentContaining(String searchKeyword);
	
	List<Board> findByTitleContainingOrContentContaining(String searchKeyword);
	List<Board> findByTitleContainingOrderBySeqDesc(String searchKeyword);
	List<Board> findByTitleContaining(String serachKeyword, Pageable paging);
}
