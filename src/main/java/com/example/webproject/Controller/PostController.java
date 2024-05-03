package com.example.webproject.Controller;

import com.example.webproject.Dao.PostDAO;
import com.example.webproject.Dto.PostDTO;
import com.example.webproject.Service.PostService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class PostController {

    private final PostService postService;


    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/post")
    public String post(){
        return "post";

    }

    @PostMapping("/post")
    public String save(@ModelAttribute PostDTO postDTO){
        System.out.println("postDTO"+ postDTO);
        postService.save(postDTO);
        return "redirect:/study";
    }
    @GetMapping("/study")
    public String findAll(Model model){
        List<PostDTO> postDTOList = postService.findALl();
        model.addAttribute("postList", postDTOList);
        return "study";
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        postService.delete(id);
        return "redirect:/study";
    }
    @GetMapping("/post-detail/{id}")
    public String postDetail(@PathVariable Long id, Model model) {
        PostDTO postDTO = postService.findById(id);
        model.addAttribute("post", postDTO);
        return "post-detail";
    }

    @GetMapping("/update/{id}")
    public String updateForm(@PathVariable Long id, Model model) {
        PostDTO postDTO = postService.findById(id);

        model.addAttribute("postUpdate", postDTO);
        return "update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute PostDTO postDTO, Model model) {
        if (postDTO.getPostId() == null) {

            return "study";
        }
        PostDTO post = postService.update(postDTO);

        model.addAttribute("post", post);
        return "redirect:/study";
    }
}
