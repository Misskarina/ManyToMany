package com.karina.many_to_many;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject,Integer> {

	List<Subject> findBySid(int sid);

	List<Subject> findBySname(String sname);

	List<Subject> findByScode(int scode);

}
