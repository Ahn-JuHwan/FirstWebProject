package com.example.webproject.Service;


import com.example.webproject.Dao.UserDAO;
import com.example.webproject.Dto.UserDTO;
import com.example.webproject.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {


    private  final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void save(UserDTO userDTO){
      UserDAO userDAO = UserDAO.touserDAO(userDTO);
      userRepository.save(userDAO);
  }
  public UserDTO login(UserDTO userDTO){
      Optional<UserDAO> byUserEmail = userRepository.findByUserEmail(userDTO.getUserEmail());
      if(byUserEmail.isPresent()){
          UserDAO userDAO = byUserEmail.get();
          if(userDAO.getUserPassword().equals(userDTO.getUserPassword())){
            UserDTO dto = UserDTO.toUserDTO(userDAO);
            return dto;
          }
          else{
              return null;
          }
      }
      else{
          return null;
      }
  }


}
