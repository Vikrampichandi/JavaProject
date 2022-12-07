package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.Bill;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {
	@Query("SELECT u FROM Bill u WHERE u.customerid = ?1")
	public List<Bill> findByCustomerid(Long customerid);	
}
