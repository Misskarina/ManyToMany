package com.karina.many_to_many;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends JpaRepository<Branch,Integer>{

	List<Branch> findByBid(int id);

	List<Branch> findByBcode(int bcode);

	

	

	

}
