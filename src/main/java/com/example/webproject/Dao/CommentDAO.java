package com.example.webproject.Dao;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "comment")
@Getter
@Setter
public class CommentDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    @Column
    private String commentContent;

    @Column
    private Date commentCreateTime;

    @ManyToOne
    @JoinColumn(name = "userId") //댓글을 쓴 Member_id
    @JsonIgnore
    private UserDAO userDAO;

    @ManyToOne
    @JoinColumn(name = "postId", nullable = false) //해당 댓글이 달린 게시물
    @JsonIgnore
    private PostDAO postDAO;

}


kdt-gitlab.elice.io/cloud_track/class_03/web_project1/team08/juhwan_project1