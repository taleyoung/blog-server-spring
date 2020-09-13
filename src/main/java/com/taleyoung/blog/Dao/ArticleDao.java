package com.taleyoung.blog.Dao;

import com.taleyoung.blog.Bean.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ArticleDao {

    @Select("SELECT * FROM article")
    public List<Article> getList();
}
