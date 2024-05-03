package com.example.webproject.Dao;

import com.example.webproject.Dto.UserDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Table(name = "user")
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false)
    private String userName;

    @Column(unique = true)
    private String userEmail;

    @Column(nullable = false)
    private String userPassword;



    @Builder.Default
    @OneToMany(mappedBy = "userDAO", cascade = CascadeType.REMOVE,fetch = FetchType.LAZY,  orphanRemoval=true)
    @JsonIgnore
    private List<PostDAO> posts = new ArrayList<>();



    public static UserDAO touserDAO(UserDTO userDTO){
        UserDAO userDAO = new UserDAO();
        userDAO.setUserName(userDTO.getUserName());
        userDAO.setUserEmail(userDTO.getUserEmail());
        userDAO.setUserPassword(userDTO.getUserPassword());

        return userDAO;
    }


}
