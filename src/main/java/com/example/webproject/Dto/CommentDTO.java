//package com.example.webproject.Dto;
//
//import com.example.webproject.Dao.CommentDAO;
//import jakarta.persistence.Column;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.time.LocalDateTime;
//import java.util.Date;
//
//@Getter
//@Setter
//@NoArgsConstructor
//public class CommentDTO {
//    private Long commentId;
//
//    private String commentContent;
//    private Long postId;
//    private LocalDateTime commentCreatedTime;
//
//
//  /*  public static CommentDTO toCommentDTO(CommentDAO commentDAO, Long postId) {
//        CommentDTO commentDTO = new CommentDTO();
//        commentDTO.setCommentId(commentDAO.getCommentId());
//        commentDTO.setCommentContent(commentDAO.getCommentContent());
//        commentDTO.setCommentCreatedTime(commentDAO.getCommentCreateTime());
//        commentDTO.setPostId(postId);
//        return commentDTO;
//    }*/
//}
