//package com.example.webproject.Dao;
//
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "comment")
//@Getter
//@Setter
//public class CommentDAO {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long commentId;
//
//    @Column
//    private String commentContent;
//
//    @Column
//    private LocalDateTime commentCreateTime;
//
//
//
//    /*public static CommentDAO toSaveEntity(CommentDTO commentDTO, PostDAO postDAO) {
//        CommentDAO commentDAO = new CommentDAO();
//        commentDAO.setCommentId(commentDTO.getCommentId());
//        commentDAO.setCommentContent(commentDTO.getCommentContent());
//        commentDAO.setPostDAO(postDAO);
//        return commentDAO;
//    }
//    public void setPostDAO(PostDAO postDAO) { // Corrected method name
//        CommentDAO.postDAO = postDAO;
//    }*/
//}
//
//
