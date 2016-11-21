package com.example.spring.repository;

import com.example.spring.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by fares on 11/21/16.
 */
public interface AuthorityRepository extends JpaRepository<Authority,String> {
}
