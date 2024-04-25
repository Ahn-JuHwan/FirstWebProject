package com.example.webproject.Dao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
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
    @Column
    private Date postCreatedTime;

    @CreationTimestamp
    @Column
    private Date postModifiedTime;

    @Column
    private String postContent;


    @ManyToOne()
    @JoinColumn(name = "userId") //글을쓴 Member_id
    @JsonIgnore
    private UserDAO userDAO;

    @OneToMany(mappedBy = "postDAO", orphanRemoval = true)
    private List<CommentDAO> comments = new ArrayList<>();






}
