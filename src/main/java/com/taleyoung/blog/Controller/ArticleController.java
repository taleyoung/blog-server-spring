package com.taleyoung.blog.Controller;

import com.taleyoung.blog.Bean.Article;
import com.taleyoung.blog.Service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

//    @GetMapping("/test")
//    public String test(){
//        return "test";
//    }

    @GetMapping("/list")
    public List<Article> getList(){
        return articleService.getList();
    }

}
