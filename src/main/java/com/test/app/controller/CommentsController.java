package com.test.app.controller;

import com.test.app.model.Comment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denis on 06.07.2014.
 */
@RestController
public class CommentsController {

    @RequestMapping(value = "/comments", method = RequestMethod.GET)
    public List<Comment> getComments(){
        List<Comment> comments = new ArrayList<Comment>();
        comments.add(new Comment("John", "Amazing video!"));
        comments.add(new Comment("Susan", "I really like it"));
        return comments;
    }

}
