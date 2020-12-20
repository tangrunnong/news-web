package com.homework.trans.controller;

import com.homework.trans.entity.News;
import com.homework.trans.entity.NewsType;
import com.homework.trans.service.NewsService;
import com.homework.trans.service.NewsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chen_yu
 * @date 2020/12/19 21:42
 */

@RestController
@RequestMapping("news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @Autowired
    private NewsTypeService newsTypeService;


    @RequestMapping("main")
    public List<NewsType> newsDetail() {
        List<NewsType> list = newsTypeService.list();
        for (NewsType newsType : list) {
            List<News> newsList = newsService.lambdaQuery().eq(News::getNewsTypeId, newsType.getId()).list();
            newsType.setNewsList(newsList);
        }
        return list;
    }
}
