package com.taleyoung.blog.Service;

import com.taleyoung.blog.Bean.Article;
import com.taleyoung.blog.Dao.ArticleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private ArticleDao articleDao;

    public List<Article> getList(){
        List<Article> res = articleDao.getList();

        return res;
    }
}
