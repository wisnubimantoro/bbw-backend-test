package com.bbw.apiva.dao;

import com.bbw.apiva.domain.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestDAO extends JpaRepository<Request, Integer> {
}
