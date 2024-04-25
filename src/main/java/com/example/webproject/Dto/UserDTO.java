package com.example.webproject.Dto;


import com.example.webproject.Dao.PostDAO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@Setter

public class UserDTO {

    private Long userId;

    private String userName;

    private String email;

    private String password;


    @Builder.Default
    private List<PostDAO> posts = new ArrayList<>();



}
