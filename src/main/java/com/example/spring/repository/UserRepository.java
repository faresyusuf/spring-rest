package com.example.spring.repository;

import com.example.spring.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;

/**
 * Created by fares on 11/21/16.
 */
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findOneByActivationKey(String activationKey);

    Optional<User> findOneByResetKey(String resetKey);

    Optional<User> findOneByEmail(String email);

    Optional<User> findOneByLogin(String login);

    Optional<User> findOneById(Long userId);

    @Query(value = "select distinct user from User user left join fetch user.authorities",
            countQuery = "select count(user) from User user")
    Page<User> findAllWithAuthorities(Pageable pageable);

    @Override
    void delete(User t);
}
