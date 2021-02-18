package com.bbw.apiva.dao;

import com.bbw.apiva.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDAO extends JpaRepository<Client, Integer> {
}
