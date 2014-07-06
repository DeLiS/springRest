package com.test.app.dao;

import com.test.app.dao.util.HibernateUtil;
import com.test.app.model.Comment;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Denis on 06.07.2014.
 */
@Repository
public class CommentDao {

    public void saveOrUpdate(Comment comment){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        session.saveOrUpdate(comment);

        session.getTransaction().commit();
    }

    public Comment findById(Long id){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("from Comment WHERE id = :id");
        query.setLong("id", id);
        Comment comment = (Comment) query.uniqueResult();
        session.getTransaction().commit();
        return comment;
    }

    public List<Comment> getComments(){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Comment> comments =  session.createQuery("from Comment").list();
        session.getTransaction().commit();
        return comments;
    }
}
