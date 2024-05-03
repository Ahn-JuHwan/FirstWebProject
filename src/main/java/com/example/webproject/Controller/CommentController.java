//package com.example.webproject.Controller;
///*
//import com.example.webproject.Dto.CommentDTO;
//import com.example.webproject.Service.CommentService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import java.util.List;
//
//@Controller
//public class CommentController {
//    private final CommentService commentService;
//
//    public CommentController(CommentService commentService) {
//        this.commentService = commentService;
//    }
//
//    @PostMapping("/save")
//    public ResponseEntity save(@ModelAttribute CommentDTO commentDTO) {
//        System.out.println("commentDTO = " + commentDTO);
//        Long saveResult = commentService.save(commentDTO);
//        if (saveResult != null) {
//            List<CommentDTO> commentDTOList = commentService.findAll(commentDTO.getPostId());
//            return new ResponseEntity<>(commentDTOList, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>("존재 x", HttpStatus.NOT_FOUND);
//        }
//    }
//}
//*/