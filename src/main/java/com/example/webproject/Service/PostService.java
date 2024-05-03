package com.example.webproject.Service;

import com.example.webproject.Dao.PostDAO;
import com.example.webproject.Dto.PostDTO;
import com.example.webproject.Repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;


    public void save(PostDTO postDTO){
        PostDAO postDAO = PostDAO.topostDAO(postDTO);
        postRepository.save(postDAO);
    }

    public List<PostDTO> findALl() {
        List<PostDAO> postDAOList =postRepository.findAll();
        List<PostDTO> postDTOList = new ArrayList<>();

        for(PostDAO postDAO: postDAOList){
            postDTOList.add(PostDTO.toPostDTO(postDAO));
        }
        return postDTOList;
    }
    @Transactional
    public PostDTO findById(Long id) {
        Optional<PostDAO> optionalBoardEntity = postRepository.findById(id);
        if (optionalBoardEntity.isPresent()) {
            PostDAO postDAO = optionalBoardEntity.get();
            PostDTO postDTO = PostDTO.toPostDTO(postDAO);
            return postDTO;
        } else {
            return null;
        }
    }

    public PostDTO update(PostDTO postDTO) {
        PostDAO postDAO = PostDAO.toUpdateEntity(postDTO);
        postRepository.save(postDAO);
        return findById(postDTO.getPostId());
    }
    public void delete(Long id) {
        postRepository.deleteById(id);
    }
}
