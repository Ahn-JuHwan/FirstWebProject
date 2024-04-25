package com.example.webproject.Repository;


import com.example.webproject.Dao.UserDAO;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<UserDAO, Long> {
    UserDAO save(UserDAO userDAO);
    Optional<UserDAO> findById(Long id);

    boolean existsByUserName(String userName);
    boolean existsByEmail(String email);

}
