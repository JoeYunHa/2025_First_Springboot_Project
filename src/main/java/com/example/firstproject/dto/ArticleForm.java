package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;

public class ArticleForm {
    private String title;
    private String content;
    // generate constructor
    public ArticleForm(String title, String content){
        this.title = title;
        this.content = content;
    }
    // override toString method to check
    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
    // convert dto to entity
    public Article toEntity(){
        return new Article(null, title, content);
    }
}
