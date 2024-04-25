package com.example.webproject.Dto;

import com.example.webproject.Dao.CommentDAO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentDTO {
    private String commentContent; //댓글 내용
    public CommentDTO() {
    }
    public CommentDTO(CommentDAO commentDAO){
        this.commentContent = commentContent;
    }
}
