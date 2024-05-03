package com.example.webproject.Dto;

import com.example.webproject.Dao.UserDAO;
import lombok.Setter;
import lombok.Getter;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long userId;
    private String userName;
    private String userEmail;
    private String userPassword;

    public static UserDTO toUserDTO(UserDAO userDAO){
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(userDAO.getUserId());
        userDTO.setUserEmail(userDAO.getUserEmail());
        userDTO.setUserPassword(userDAO.getUserPassword());
        userDTO.setUserName(userDAO.getUserName());
        return userDTO;
    }



}
