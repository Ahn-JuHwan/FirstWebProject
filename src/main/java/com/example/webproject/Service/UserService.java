package com.example.webproject.Service;


import com.example.webproject.Dao.UserDAO;
import com.example.webproject.Dto.SignupDTO;
import com.example.webproject.Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public UserDAO signUp (SignupDTO signupDTO){
        UserDAO userDAO;
        if(!userRepository.existsByUserName(signupDTO.getUserName()) && !userRepository.existsByEmail(signupDTO.getEmail())){
            userDAO = userRepository.save(signupDTO.toEntity());
        }
        else{
            userDAO = null;

        }
        return userDAO;
    }
}
