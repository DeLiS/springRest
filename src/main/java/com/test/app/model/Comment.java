package com.test.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Denis on 06.07.2014.
 */
@Entity
public class Comment {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Size(min=1)
    private String author;

    @NotNull
    @Size(min=1)
    private String text;

    public Comment(){}

    public Comment(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
