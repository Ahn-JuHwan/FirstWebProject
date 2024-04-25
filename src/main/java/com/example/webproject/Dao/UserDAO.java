package com.example.webproject.Dao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Getter
@Table(name = "user")
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column
    private String userName;

    @Column
    private String email;

    @Column
    private String password;


    @OneToMany(mappedBy = "userDAO", cascade = CascadeType.REMOVE,fetch = FetchType.EAGER,  orphanRemoval=true)
    @JsonIgnore
    private List<PostDAO> posts = new ArrayList<>();

    @OneToMany(mappedBy = "userDAO", cascade = CascadeType.REMOVE,fetch = FetchType.LAZY,  orphanRemoval=true)
    @JsonIgnore
    private List<CommentDAO> comments = new ArrayList<>();



    public UserDAO(String email, String password, String userName) {

        this.email = email;
        this.password = password;
        this.userName = userName;
    }

}
