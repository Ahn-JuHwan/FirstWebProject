package com.example.webproject.Dto;

import com.example.webproject.Dao.CommentDAO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PostDTO {

    private Long postId;
    private String postContent;

    @JsonIgnore
    private Timestamp postCreatedTime;
    @JsonIgnore
    private Timestamp postModifiedTime;

    @JsonIgnore
    private List<CommentDAO> comments;
}
