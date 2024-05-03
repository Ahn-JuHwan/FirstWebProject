package com.example.webproject.Repository;

import com.example.webproject.Dao.PostDAO;
import com.example.webproject.Dao.UserDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<PostDAO, Long> {
    void delete(PostDAO postDAO);

}
