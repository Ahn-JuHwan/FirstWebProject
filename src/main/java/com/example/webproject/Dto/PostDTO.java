package com.example.webproject.Dto;

import com.example.webproject.Dao.PostDAO;
import com.example.webproject.Dao.UserDAO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PostDTO {

    private UserDTO user;

    private Long postId;
    private String postContent;
    private String title;




    private LocalDateTime postCreatedTime;
    private LocalDateTime postModifiedTime;




    public static PostDTO toPostDTO(PostDAO postDAO){
        PostDTO postDTO = new PostDTO();
        postDTO.setPostId(postDAO.getPostId());
        postDTO.setPostContent(postDAO.getPostContent());
        postDTO.setTitle(postDAO.getTitle());
        postDTO.setPostCreatedTime(postDAO.getPostCreatedTime());
        postDTO.setPostModifiedTime(postDAO.getPostModifiedTime());
        return postDTO;
    }


}
