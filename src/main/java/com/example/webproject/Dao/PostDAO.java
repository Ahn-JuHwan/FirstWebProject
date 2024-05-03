package com.example.webproject.Dao;

import com.example.webproject.Dto.PostDTO;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "post")
@NoArgsConstructor
@Getter
@AllArgsConstructor
@Builder
@Data
@Setter
public class PostDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long postId;

    @Column
    private String title;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime postCreatedTime;


    @UpdateTimestamp
    @Column(insertable = false)
    private LocalDateTime postModifiedTime;


    private String postContent;


    @ManyToOne
    @JoinColumn(name = "user_id") //글을쓴 user_Id
    private UserDAO userDAO;
//
//    @OneToMany(mappedBy = "postDAO", cascade = CascadeType.REMOVE, orphanRemoval = true, fetch = FetchType.LAZY)
//    private List<CommentDAO> commentEntityList = new ArrayList<>();


    public static PostDAO topostDAO(PostDTO postDTO){
        PostDAO postDAO = new PostDAO();
        postDAO.setTitle(postDTO.getTitle());
        postDAO.setPostContent(postDTO.getPostContent());
        postDAO.setPostCreatedTime(postDTO.getPostCreatedTime());
        postDAO.setPostModifiedTime(postDTO.getPostModifiedTime());
        return postDAO;
    }

    public static PostDAO toUpdateEntity(PostDTO postDTO) {
        PostDAO postDAO = new PostDAO();
        postDAO.setPostId(postDTO.getPostId());
        postDAO.setTitle(postDTO.getTitle());
        postDAO.setPostContent(postDTO.getPostContent());
        postDAO.setPostCreatedTime(postDTO.getPostCreatedTime());
        postDAO.setPostModifiedTime(LocalDateTime.now());
        return postDAO;
    }
}
