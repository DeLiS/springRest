package com.test.app.controller;

import com.test.app.dao.CommentDao;
import com.test.app.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Denis on 06.07.2014.
 */
@RestController
public class CommentsController {

    @Autowired
    private CommentDao commentDao;

    @RequestMapping(value = "/comments", method = RequestMethod.GET)
    public List<Comment> getComments(){
        return commentDao.getComments();
    }

    @RequestMapping(value = "/comments", method = RequestMethod.POST)
    public void putComment(Comment comment){
        commentDao.saveOrUpdate(comment);
    }

}
